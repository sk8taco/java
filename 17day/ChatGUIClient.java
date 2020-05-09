package j200211;

import java.net.*;//Socket클래스(네트워크를 연결시켜주는 역할을 하는 클래스)
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
	//----------------
	public ChatGUIClient() {
		//창 및 부착시킬 컴포넌트를 생성->연결
		tf=new JTextField();
		ta=new JTextArea();
		js=new JScrollPane(ta);//JTextArea에 스크롤바를 기능결합
		//부착->배치관리자(BorderLayout)
		add(js,"Center");//JTextArea을 정중앙에 배치
		add(tf,"South");//BorderLayout.SOUTH
		tf.addActionListener(this);
		setBounds(200,200,500,350);
		setVisible(true);
		tf.requestFocus();//커서입력
		//종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//서버와 연결하는 구문
		try {
			//1.접속할 컴퓨터의 ip주소 (192.168.0.35),2.포트번호(5432)
			s=new Socket("192.168.0.35",5432);
			System.out.println("s="+s);
			//---------------------------------------
		}catch(Exception e) {
			System.out.println("접속오류=>"+e);
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatGUIClient();
	}
}



