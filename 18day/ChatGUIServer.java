package j200212;

//입출력
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//서버역할->1.클라이언트와의 접속->접속정보->아이디로 구분
//ServerSocket,Socket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Vector;//동적배열->실시간으로 접속한 클라이언트수(고정배열X)

public class ChatGUIServer {
	
	ServerSocket ss;//클라이언트와의 접속할때만 필요
	Socket s;//클라이언트와 통신(문자열 전송)
    Vector v;//실시간으로 접속한 클라이언트의 정보를 저장
    
    //1.ServerThread클래스의 객체가 필요->멤버변수로 선언->has a 관계
    ServerThread st;
    //=============
    public ChatGUIServer() throws Exception { //멤버변수의 초기값을 설정
    	//서버를 가동->클라이언트가 접속할때 기다린다.(무한루프)->무한대기
    	Properties props=new Properties();
    	FileInputStream in=new FileInputStream
    			("C:/webtest/3.java/sou/JavaStudy/src/j200212/port.properties");
    	String service="";//불러올 포트번호를 저장할 변수
    	/*입출력->파일을 불러올 수 있는 상태인지 체크->available()->-1리턴(못 불러오는경우)
    	 *                                                                  잘 불러올 수 있는 상태(양수)>0
    	 */
    	if(in!=null && in.available()>0) {//경로 및  파일이 존재하면서 불러올 수있는 상태라면
    		props.load(in);
    		service=props.getProperty("port");//"1"
    	}
    	if("".contentEquals(service)) {//정상적으로 ""인경우
    		service="5432";//없으면 5432을 사용하겠다.
    	}
    	int port=Integer.parseInt(service);//"1"->1
    	switch (port) {
		case 1:
			     port=5432;
			break;
        //2
		case 2:
		     port=5000;
		break;	
	    //3
		case 3:
		     port=5500;
		break;
		
		default:
			 port=3000;
			break;
		}
    	System.out.println("port=>"+port);//5432
    	//-----------------------------------------------------------
    	v=new Vector();//생성자에서는 다른 클래스 객체명 사용이 가능
    	try {
    		//1.서버소켓생성->포트번호를 이용해서 접속
    		//ss=new ServerSocket(5432);//7777(포트번호는 임의의 번호)
    		ss=new ServerSocket(port);
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
    	for(int i=0;i<v.size();i++) {
    		ServerThread st=(ServerThread)v.elementAt(i);
    		st.send(str);
    	}
    }
	public static void main(String[] args) throws Exception {
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
	
	//쓰레드의 생성자->데이터를 실시간으로 전송->입출력스트림생성
	public ServerThread(ChatGUIServer cg,Socket s) {
		 //cg=new ChatGUIServer(); 사용X 2.메서드의 매개변수를 이용
		this.cg=cg;
		this.s=s;//접속한 클라이언트의 정보
		
		try {
			//s.getInputStream()=>상대방이 출력->서버데이터를 입력객체를 받아와야 된다.
			br=new BufferedReader
					 (new InputStreamReader(s.getInputStream()));//System.in(로컬)
		    //BufferedWriter->bw.write(값)->출력할때 사용
			//bw.flush();->버퍼에 저장된 양을 바로바로 전송
			//1.상대방접속자에게 출력할 출력객체,2.autoflush(자동으로 출력이 되는 기능)을 사용유무
			pw=new PrintWriter(s.getOutputStream(),true);
		}catch(Exception e) {
			System.out.println("연결실패(e)=>"+e);
		}
	}
	//데이터를 전송해주는 메서드(클라이언트)->broadCast(String str)->
	public void send(String str) {
		pw.println(str);//상대방이 쓴글을 모든 접속자에게 동시에 출력
		pw.flush();
	}
	//실시간으로 데이터를 전송하기위해서는 run()이 실행이 되어야 한다.
	@Override
	public void run() {//->broadCast(str)->send(str)
		// TODO Auto-generated method stub
		//대화명을 입력?->대화명=>모든 접속자에게 입장했음을 알려준다.->퇴장
		try {
			pw.println("먼저 대화명을 입력하세요?");
			name=br.readLine();//<->상대방의 클라이언트로부터 받음
			//각 클라이언트에게 특정대화명을 쓴 사용자가 입장했다는 메세지 전달
			System.out.println("server에서 전달받은 name=>"+name);
			cg.broadCast("["+name+"]님이 입장하셨습니다.");
			while((str=br.readLine())!=null) {//계속 입력을 받는 동안
				cg.broadCast("["+name+"]"+str);//대화명:전달할 문자열
			}
		}catch(Exception e) {//종료시 연결자동으로 해제->퇴장으로 간주
			//접속자가 퇴장->접속한 사람들에게 실시간 전송
			cg.removeThread(this);//ServerThread의 객체 st(현재 접속해서 빠져나가는 사람)
			cg.broadCast("["+name+"]님이 퇴장하셨습니다.");
			//상대방의 ip주소를 출력
			System.out.println(s.getInetAddress()+"의 연결이 종료됨!");//접속자의 ip주소
		}
	}
}

















