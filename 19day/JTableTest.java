package j200213;

//2차원 표형태로 제공되는 컴포넌트->JTable

import java.awt.*;
import javax.swing.*;
/*
 * MVC 모델->1.Model->데이터 저장영역(배열로 선언)
 *                 2.View->보여줄 컴포넌트(=JTable,JScrollPane)
 *                 3.Controller->Model--->JTable와 연결해서 원하는 데이터를 보여줄것인가를 지정
 */
public class JTableTest extends JFrame{

	JTable table;//부착시킬 컴포넌트를 생성자에서 직접 선언,생성도 가능
	
	public JTableTest() {
		setTitle("JTable 구조연습");
		//-----------Model-------------
		String header[]= {"이름","주소","전화번호"};//컬럼명
		String cells[][]= {{"홍길동","서울","02-123-0987"},//데이터
				                  {"테스트","광주","02-654-1234"},
				                  {"임시","경기도","02-456-0987"}};
		table=new JTable(cells,header);//1.Data 2.column
		/*
		JScrollPane js=new JScrollPane(table);
		add(js);*/
		add(new JScrollPane(table));
		//---------------------------------
		setBounds(800,300,400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new JTableTest();
	}

}
