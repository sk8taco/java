package j200213;

import java.awt.*;
import java.awt.event.*;//이벤트처리=>ActionEvent->ActionListener이용
import javax.swing.*;
//추가
import javax.swing.table.*;//DefaultTableModel클래스(데이터 저장부분)

public class JTableTest2 extends JFrame implements ActionListener {

	JLabel l1,l2,l3;//이름,나이,전번
	JTextField tf1,tf2,tf3;
	JPanel panel;//다른 컴포넌트 포함(영역구분)
	//JTable
	Object ob[][]=new Object[0][3];//행X,열만 표시
	DefaultTableModel model;//데이터 저장시키는 영역
	JTable table;
	JScrollPane js;
	String str[]= {"이름","나이","전번"};//컬럼명
	
	public JTableTest2() {
		super("테이블에 데이터입력");
		panel=new JPanel();
		panel.setBackground(Color.orange);
		//1.출력문자열 2.위치(left,center,right)
	    l1=new JLabel("이름",JLabel.CENTER);
	    l2=new JLabel("나이",JLabel.LEFT);
	    l3=new JLabel("전번",JLabel.RIGHT);
	    
	    tf1=new JTextField(); tf2=new JTextField();tf3=new JTextField();
	    //패널=>3행 2열=>GridLayout
	    panel.setLayout(new GridLayout(3,2));
	    panel.add(l1); panel.add(tf1);//이름
	    panel.add(l2); panel.add(tf2);
	    panel.add(l3); panel.add(tf3);
	    //패널을 위쪽에 부착
	    this.add("North",panel);//1.위치,2.부착시킬컴포넌트명
	    //JTable <=모델을 따로 만들어서 부착
	    model=new DefaultTableModel(ob,str);//1.데이터저장부분 [][] 2.컬럼명
	    table=new JTable(model);//table=new JTable(ob,str);
	    js=new JScrollPane(table);
	    this.add("Center",js);
	    //화면에 출력
	    setBounds(1250,250,400,300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    //이벤트처리
	    tf1.addActionListener(this);
	    tf2.addActionListener(this);
	    tf3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//e.getSource()->이벤트를 발생시키는 컴포넌트를 얻어온다.
		if(e.getSource()==tf1) {//이름란에 이름을 입력하고 enter쳤다면
			tf2.requestFocus();//커서이동
		}else if(e.getSource()==tf2) {//나이
			tf3.requestFocus();
		}else if(e.getSource()==tf3) {//전번
			if(tf1.getText().equals("") && tf2.getText().equals("") &&
			   tf3.getText().equals("")) {
				//alert(~)
				//형식)JOptionPane.showMessageDialog(부모객체명,경고메세지)
				JOptionPane.showMessageDialog(this, "하나정도는 입력해야됩니다.");
				tf1.requestFocus();
				return;
			}//if문
			//저장->다입력을 했다면 모델에 데이터를 입력->JTable에 결과를 출력
			//형식) 모델객체명.addRow(저장할값=>배열의 값)
			//Object data[]= {"111","222","333"}; //어느 데이터든지 다 저장이 가능하도록 Object
		    Object data[]= {tf1.getText(),tf2.getText(),tf3.getText()};
			model.addRow(data);
		    //다시 입력을 받을 수 있도록 초기화
		    tf1.setText("");
		    tf2.setText("");
		    tf3.setText("");
		    tf1.requestFocus();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTableTest2();
	}
}



