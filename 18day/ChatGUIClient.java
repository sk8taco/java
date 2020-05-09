package j200212;

import java.net.*;//Socket클래스(네트워크를 연결시켜주는 역할을 하는 클래스)
import java.util.Properties;
import java.io.*;//입출력
import java.awt.*;//GUI
import javax.swing.*;//JFrame,JTextField, JTextArea,JScrollPane필요
import java.awt.event.*;//event처리

public class ChatGUIClient extends JFrame implements ActionListener,Runnable{

	JTextField tf;//입력
	JTextArea ta;//클라이언트와의 대화를 출력
	//추가
	JScrollPane js;//스크롤바 생성때문에 필요
	//----추가--------
	Socket s;//서버와 통신하기 위해서 
	BufferedReader br;//입력용(대용량)
	PrintWriter pw;//출력용
	String str,str1;//서버,대화창에 출력할 문자열
	//----------------
	public ChatGUIClient() {
		//창 및 부착시킬 컴포넌트를 생성->연결
		tf=new JTextField();
		ta=new JTextArea();
		js=new JScrollPane(ta);//JTextArea에 스크롤바를 기능결합
		//부착->배치관리자(BorderLayout)
		add(js,"Center");//JTextArea을 정중앙에 배치
		add(tf,"South");//BorderLayout.SOUTH
		tf.addActionListener(this);//이벤트처리
		setBounds(200,200,500,350);
		setVisible(true);
		tf.requestFocus();//커서입력
		//종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//퇴장
		//서버와 연결하는 구문
		try {
			//1.접속할 컴퓨터의 ip주소 (192.168.0.35),2.포트번호(5432)
			Properties props=new Properties();
	    	FileInputStream in=new FileInputStream
	    			("C:/webtest/3.java/sou/JavaStudy/src/j200212/port.properties");
	    	String ip="";//불러올 ip주소를 저장할 변수
	    	
	    	if(in!=null && in.available()>0) {//경로 및  파일이 존재하면서 불러올 수있는 상태라면
	    		props.load(in);
	    		ip=props.getProperty("ip");//불러올 ip
	    	}
			//--------------------------------------------------------
			s=new Socket(ip,5432);
			System.out.println("s="+s);
			//-----서버와 연결할 수있는 입출력을 생성----------------------------------
			br=new BufferedReader
					 (new InputStreamReader(s.getInputStream()));//System.in(로컬)
			System.out.println("client의 br=>"+br);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			System.out.println("client의 pw=>"+pw);
			
		}catch(Exception e) {
			System.out.println("접속오류=>"+e);
		}
		//Thread객체를 생성->run()호출
		Thread ct=new Thread(this);//ChatGUIClient객체->Runnable객체
		System.out.println("client의 ct객체생성(ct)=>"+ct);
		ct.start();//run()
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//더이상 입력을 받을 수 없을때까지 ->JTextArea(채팅창에 출력)=>String
		try {
			while((str1=br.readLine())!=null) {
				ta.append(str1+"\n");//상대방이 보내준글자(str1)를 세로로 채팅창에 출력
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		str=tf.getText();//내가 쓴글자
		tf.setText("");//지우기->새글자 입력
		pw.println(str);//상대방->br.readLine()
		pw.flush();//버퍼에 저장된 글이 있다면 바로바로 출력하라.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatGUIClient();
	}
}



