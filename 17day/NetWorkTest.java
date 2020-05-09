package j200211;

//통신
import java.net.*;//InetAddress,Socket,ServerSocket

public class NetWorkTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //www.naver.com->ip주소
		InetAddress ia=null;
		InetAddress ia2[];//컴퓨터가 한대이상의 주소를 관리(웹서버)
		//원격컴퓨터에 접속->도메인이름->ex)다음->직접 ip주소 접근금지
		ia=InetAddress.getByName("www.naver.com");//unKnownHostException
		System.out.println("서버주소->"+ia.getHostAddress());//203.133.167.16
		//서버가 한대이상->getAllByName
		System.out.println("=====================");
		ia2=InetAddress.getAllByName("www.naver.com");
		//확장 for문
		for(InetAddress aa:ia2)
			System.out.println("서버들 주소=>"+aa.getHostAddress());
		System.out.println("===자기 컴퓨터의 정보===");
		InetAddress host=InetAddress.getLocalHost();//자기 컴퓨터 정보
		System.out.println("내 컴퓨터명=>"+host.getHostName());//문자열
		System.out.println("내 ip주소=>"+host.getHostAddress());//숫자
	}
}





