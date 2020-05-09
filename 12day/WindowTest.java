package j200204;
//1.특정 이벤트가 발생이 되면 누가 처리?  발생시킨 클래스에서 처리=>상속을 받아서 처리

import java.awt.*;
import javax.swing.*;//스윙
//추가
import java.awt.event.*;//event패키지에 존재하는 인터페이스,클래스(이벤트처리)
//WindowEvent->WindowListener인터페이스 
public class WindowTest extends JFrame implements WindowListener{

	public WindowTest() {
		setTitle("상속받아 이벤트처리함");
		setBounds(400,500,400,300);//x,y,w,h
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//이벤트가 발생=>운영체제에게 신호를 전달
		//형식) 이벤트발생대상자.addXXXXListener(이벤트를 처리해줄 객체명)
		this.addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new WindowTest();//제목이 없는 창이 생성
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");//창이 활성화될때 호출
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		//윈도우창이 닫힌 후에 발생
	}
    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");//윈도우의  x버튼을 클릭했을때 자동으로 호출
		System.exit(0);//정상종료
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");//창이 비활성화될때 호출
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");//작업표시줄의 창이 띄어올라와서 보여줄때
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");//작업표시줄에 창이 들어간상태(아이콘화)
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");//창이 열렸을때 호출되는 메서드
	}
}



