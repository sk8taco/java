package j200211;

//서버역할->1.클라이언트와의 접속->접속정보->아이디로 구분
import java.net.*;//ServerSocket,Socket;
import java.io.*;//입출력
import java.util.Vector;//동적배열->실시간으로 접속한 클라이언트수(고정배열X)

public class ChatGUIServer {
	
	ServerSocket ss;//클라이언트와의 접속할때만 필요
	Socket s;//클라이언트와 통신(문자열 전송)
    Vector v;//실시간으로 접속한 클라이언트의 정보를 저장
    
    //1.ServerThread클래스의 객체가 필요->멤버변수로 선언->has a 관계
    ServerThread st;
    //=============
    public ChatGUIServer() { //멤버변수의 초기값을 설정
    	//서버를 가동->클라이언트가 접속할때 기다린다.(무한루프)->무한대기
    	v=new Vector();//생성자에서는 다른 클래스 객체명 사용이 가능
    	try {
    		//1.서버소켓생성->포트번호를 이용해서 접속
    		ss=new ServerSocket(5432);//7777(포트번호는 임의의 번호)
    		System.out.println("ss=>"+ss);
    		System.out.println("채팅서버 가동중....");
    		//무한대기
    		while(true) {
    			s=ss.accept();//접속한 클라이언트의 정보를 가진 s
    			System.out.println("Accepted from "+s);
    			//연결이 된 이후에 ServerThread객체를 생성
    			st=new ServerThread(this,s);
    			//생성자->자기클래스의 다른 메서드호출할때 객체명 생략->this
    			this.addThread(st);//접속할때 서버의 메모리공간에 클라이언트정보를 벡터에 저장
    			//Thread가동
    			st.start();//->run()->broadCast()->send() 실시간으로 메서드호출
    		}
    	}catch(Exception e) {
    		System.out.println("서버접속 실패=>"+e);//e.getMessage()간단한 에러메세지
    		                                                         //e.toString()중간, 
    		                                                         //e.printStackTrace();
    	}
    }
    //1.벡터에 접속한 클라이언트정보 저장->매개변수O,반환형X
    public void addThread(ServerThread st) { //메서드의 매개변수를 통해 가져옴
    	v.add(st);
    }
    //2.퇴장한 클라이언트의 정보저장->벡터에서 삭제(수정)
    public void removeThread(ServerThread st) {
    	v.remove(st);//remove(삭제할 객체명)
    }
    //3.각 클라이언트에게 실시간으로 메세지를 전달시켜주는 메서드->매개변수 O, 반환값X
    public void broadCast(String str) {
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               new ChatGUIServer();//익명객체
	}
}
//실시간으로 데이터전송->쓰레드 기능이 필요
class ServerThread extends Thread{
	
	Socket s;//클라이언트와 통신
	ChatGUIServer cg;//1.상대방 클래스의 객체 선언->has a 관계
	//입출력
	BufferedReader br;//대량용 입력용
	PrintWriter pw;//출력용->BufferedWriter bw;
	String str;//전달할 문자열
	String name;//대화명(id)
	
	public ServerThread(ChatGUIServer cg,Socket s) {
		 //cg=new ChatGUIServer(); 사용X 2.메서드의 매개변수를 이용
	}
	//데이터를 전송해주는 메서드(클라이언트)
	public void send(String str) {
		
	}
	//실시간으로 데이터를 전송하기위해서는 run()이 실행이 되어야 한다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

















