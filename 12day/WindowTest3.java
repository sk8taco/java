package j200204;
//1.특정 이벤트가 발생이 되면 누가 처리?  발생시킨 클래스에서 처리=>상속을 받아서 처리

import java.awt.*;
import javax.swing.*;//스윙
//추가
import java.awt.event.*;//event패키지에 존재하는 인터페이스,클래스(이벤트처리)

/*
 * 2.이벤트를 발생시켰을때 이벤트처리는 다른 클래스가 대신해주는 경우
 * 
 */
public class WindowTest3 extends JFrame {

	public WindowTest3() {
		setTitle("3.이름이 있는 내부클래스를 이용하는 방법");
		setBounds(400,500,400,300);//x,y,w,h
		//--------------------------------
		/*  Other ot=new Other();
		this.addWindowListener(ot); */
		//---------------------------------
		this.addWindowListener(new Other2());
		setVisible(true);
	}
	//----------------------------------------
	class Other2 extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) { //1개만 재정의 하면 된다.
			// TODO Auto-generated method stub
			System.out.println("windowClosing");//윈도우의  x버튼을 클릭했을때 자동으로 호출
			System.exit(0);//정상종료
		}
	}
	//----------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new WindowTest3();//제목이 없는 창이 생성
	}
	
}

//이벤트를 대신 처리해주는 클래스를 따로 만들어서 호출
/*
class Other2 extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) { //1개만 재정의 하면 된다.
		// TODO Auto-generated method stub
		System.out.println("windowClosing");//윈도우의  x버튼을 클릭했을때 자동으로 호출
		System.exit(0);//정상종료
	}
}
*/









