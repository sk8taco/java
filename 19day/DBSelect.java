package j200213;

//1.DB접속->1.테이블을 생성->2.입력->3.검색->4.출력
import java.sql.*; //DB연동 패키지

public class DBSelect {

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
		}catch(Exception e) {
			System.out.println("DB연결실패(e)=>"+e);
		} 
	}
}
