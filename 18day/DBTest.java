package j200212;

//오라클에 접속이 가능한지 확인해보는 예제
import java.sql.*;//DB에 관련된 클래스불러올때->java.io.*,java.net.*,java.util.*
                           //예외처리->1.입출력 2.네트워크 3.DB연동 및 처리

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //DB에 접속에 성공한 상태->Connection객체가  필요하다.(로그인할때)
		Connection con=null;
		//형식)jdbc:oracle:thin:@상대방의 접속ip:접속포트번호(1521):SID(orcl)
		String url="jdbc:oracle:thin:@localhost:1521:orcl";//오라클 서버(자기것)
		
		try {
			//1.접속할 드라이버를 메모리에 올리기(상위패키지명.하위패키지명..클래스명)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.접속하기위해서 로그인인증->1.접속경로 2.접속계정 3.암호
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("접속 con=>"+con);
			//접속 con=>oracle.jdbc.driver.T4CConnection@2d38eb89
		}catch(Exception e) {
			System.out.println("DB연결실패(e)=>"+e);
		} 
		
	}

}





