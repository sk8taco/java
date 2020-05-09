package j200204;

import java.awt.*;//그래픽
import javax.swing.*;//스윙

//상속을 받아서 작성
public class BorderTest extends JFrame {

	//부착시킬 컴포넌트를 멤버변수로 선언
	JButton b1,b2,b3,b4,b5;
	//생성자에서 화면디자인을 하는것이 훨씬좋다.
	public BorderTest(String str) {
		 setTitle(str);//super(str);
		 setBounds(300,300,400,300);//x,y,w,h->창의 위치와 크기를 지정
		 //창에 배경색을 부여->Color의 정적상수를 이용
		 /*
		 Color c=new Color(233,127,97);//r,g,b
		 this.getContentPane().setBackground(c);
		 */
		 //부착시킬 컴포넌트를 생성
		 b1=new JButton("연습1");
		 b2=new JButton("연습2");
		 b3=new JButton("연습3");
		 b4=new JButton("연습4");
		 b5=new JButton("연습5");
		 //창객체명.add(부착시킬 컴포넌트명,위치(BorderLayout.위치)
		 /* (1)BorderLayout(동,서,남,북,가운데 배치방법)
		 this.getContentPane().add(b1,BorderLayout.WEST);//"West"
		 this.add(b2,"East");//오른쪽
		 this.add(b3,"Center");
		 this.add(b4,"North");
		 this.add(b5,"South");
		 */
		 /* (2) FlowLayout->왼->오른쪽으로 배치시키는 방법
		 FlowLayout fl=new FlowLayout();
		 this.getContentPane().setLayout(fl);//flowLayout으로 배치관리자를 변경
		 */
		 this.getContentPane().setLayout(new GridLayout(3,2,5,5));//행,열,hgap,vgap
		 add(b1); add(b2); add(b3); add(b4); add(b5);
		 
		 this.getContentPane().setBackground(new Color(215,111,241));
		 //this.getContentPane().setBackground(Color.red);
		 //배치관리자를 지정->getContentPane().setLayout(배치관리자 객체지정)
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//System.exit(0)
		 setVisible(true);//->show()(X)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //BorderTest bt=new BorderTest("배치관리자 연습");
		    new BorderTest("배치관리자 연습");//앞에 객체명을 생략->익명객체
	}
}



