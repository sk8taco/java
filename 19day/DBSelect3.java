package j200213;

//1.DB접속->1.테이블을 생성->2.입력->3.검색->4.출력
import java.sql.*; //DB연동 패키지

public class DBSelect3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;//DB종류에 상관없이 다 사용
		//형식)jdbc:oracle:thin:@상대방의 접속ip:접속포트번호(1521):SID(orcl)
		String url="jdbc:oracle:thin:@localhost:1521:orcl";//오라클 서버(자기것)
		//추가
		Statement stmt=null;//create table~
		PreparedStatement pstmt=null;//insert into~?,?,?
		Statement stmt2=null;//select구문->표형태
		ResultSet rs=null;//select 검색결과를 표형태로 보여준다.
		String sql="";//sql구문을 저장
		
		try {
			//1.접속할 드라이버를 메모리에 올리기(상위패키지명.하위패키지명..클래스명)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.접속하기위해서 로그인인증->1.접속경로 2.접속계정 3.암호
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("접속 con=>"+con);
			//접속 con=>oracle.jdbc.driver.T4CConnection@2d38eb89
			//3.테이블을 생성->create table->stmt
			stmt=con.createStatement();//메서드의 반환형
			sql="create table MyTest(name varchar2(20),age number)";
			int create=stmt.executeUpdate(sql);
			System.out.println("테이블 성공유무(create)=>"+create);
			//4.insert
			//sql="insert into Mytest values(?,?)";
			pstmt=con.prepareStatement("insert into Mytest values(?,?)");
			//형식)pstmt객체명.setString(or setInt,setDouble,,,(?의 순서,입력할값)
			pstmt.setString(1, "hong");//pstmt.setString(1,tf1.getText())
			pstmt.setInt(2, 23);
			int insert=pstmt.executeUpdate();//1=>성공,0=>실패
			System.out.println("데이터가 입력성공유무(insert)=>"+insert);
			//5.select->필드별로 출력해서 결과를 보기
			stmt2=con.createStatement();
			//String sql2="select * from MyTest";//필드의 순서는 만들어진 순서대로 불러온다.
			rs=stmt2.executeQuery("select * from MyTest");
			
			while(rs.next()) {//이동시켜서 보여줄 레코드가 존재하는한
				String name=rs.getString("name");//rs.get자료형(필드명 또는 인덱스번호)
				int age=rs.getInt(2);//name,age ->rs.getInt("age")이 권장
				System.out.println("name=>"+name+",age=>"+age);
			}
			//6.메모리해제->에러유발과 상관없이 반드시 처리하고 프로그램을 종료
		    rs.close();
		    stmt2.close();
		    pstmt.close();
		    stmt.close();
		    con.close();
		}catch(Exception e) {
			System.out.println("DB연결실패 및 SQL구문 오타를 확인할것.(e)=>"+e);
		}finally {
			//rs.close();
		}
	}
}





