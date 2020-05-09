package j200213;

import java.awt.*;
import java.awt.event.*;//�̺�Ʈó��=>ActionEvent->ActionListener�̿�
import javax.swing.*;
//�߰�
import javax.swing.table.*;//DefaultTableModelŬ����(������ ����κ�)

public class JTableTest2 extends JFrame implements ActionListener {

	JLabel l1,l2,l3;//�̸�,����,����
	JTextField tf1,tf2,tf3;
	JPanel panel;//�ٸ� ������Ʈ ����(��������)
	//JTable
	Object ob[][]=new Object[0][3];//��X,���� ǥ��
	DefaultTableModel model;//������ �����Ű�� ����
	JTable table;
	JScrollPane js;
	String str[]= {"�̸�","����","����"};//�÷���
	
	public JTableTest2() {
		super("���̺� �������Է�");
		panel=new JPanel();
		panel.setBackground(Color.orange);
		//1.��¹��ڿ� 2.��ġ(left,center,right)
	    l1=new JLabel("�̸�",JLabel.CENTER);
	    l2=new JLabel("����",JLabel.LEFT);
	    l3=new JLabel("����",JLabel.RIGHT);
	    
	    tf1=new JTextField(); tf2=new JTextField();tf3=new JTextField();
	    //�г�=>3�� 2��=>GridLayout
	    panel.setLayout(new GridLayout(3,2));
	    panel.add(l1); panel.add(tf1);//�̸�
	    panel.add(l2); panel.add(tf2);
	    panel.add(l3); panel.add(tf3);
	    //�г��� ���ʿ� ����
	    this.add("North",panel);//1.��ġ,2.������ų������Ʈ��
	    //JTable <=���� ���� ���� ����
	    model=new DefaultTableModel(ob,str);//1.����������κ� [][] 2.�÷���
	    table=new JTable(model);//table=new JTable(ob,str);
	    js=new JScrollPane(table);
	    this.add("Center",js);
	    //ȭ�鿡 ���
	    setBounds(1250,250,400,300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    //�̺�Ʈó��
	    tf1.addActionListener(this);
	    tf2.addActionListener(this);
	    tf3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//e.getSource()->�̺�Ʈ�� �߻���Ű�� ������Ʈ�� ���´�.
		if(e.getSource()==tf1) {//�̸����� �̸��� �Է��ϰ� enter�ƴٸ�
			tf2.requestFocus();//Ŀ���̵�
		}else if(e.getSource()==tf2) {//����
			tf3.requestFocus();
		}else if(e.getSource()==tf3) {//����
			if(tf1.getText().equals("") && tf2.getText().equals("") &&
			   tf3.getText().equals("")) {
				//alert(~)
				//����)JOptionPane.showMessageDialog(�θ�ü��,���޼���)
				JOptionPane.showMessageDialog(this, "�ϳ������� �Է��ؾߵ˴ϴ�.");
				tf1.requestFocus();
				return;
			}//if��
			//����->���Է��� �ߴٸ� �𵨿� �����͸� �Է�->JTable�� ����� ���
			//����) �𵨰�ü��.addRow(�����Ұ�=>�迭�� ��)
			//Object data[]= {"111","222","333"}; //��� �����͵��� �� ������ �����ϵ��� Object
		    Object data[]= {tf1.getText(),tf2.getText(),tf3.getText()};
			model.addRow(data);
		    //�ٽ� �Է��� ���� �� �ֵ��� �ʱ�ȭ
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



