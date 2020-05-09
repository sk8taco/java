package j200205;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//��ưŬ��->ActionEvent->ActionListener->actionPerformed(),�ؽ�Ʈ�ʵ�
public class ButtonEvent extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4;
	JTextField tf1;//����ڷκ��� ���� �Է��� ������
	
	//������Ʈ�� �����ϴ� ���(â->�г�->��ư)<->������Ʈ ������Ű�� ���(��ư->�г�->â����)
	public ButtonEvent() {
		super("��ư�� �̿��� �̺�Ʈó���� ��ü����ȯ");
		setBounds(300,200,300,250);//x,y,w,h
		getContentPane().setLayout(new GridLayout(5,1,3,3));//5X1 ǥ
		//JPanel p=new JPanel();
		//â�� ������ų ������Ʈ�� ����
		b1=new JButton("����");
		b2=new JButton("��");
		b3=new JButton("��");
		b4=new JButton("����");
		tf1=new JTextField(" ");//���Է�â
		//������Ű�� ����=>������Ʈ�� ����� ������ ���ݴ�� �ڵ�
		//p.add(comp)~ getContentPane().add(p)
		this.add(b1); add(b2); add(b3); add(b4);add(tf1);
		//4��° Inner Class���
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {//��ü�� ������ ���(�Ű�����)
				System.exit(0);
			}
		});
		//��ư������ŭ Ŭ��->ȣ��
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		tf1.addActionListener(this);
		
		setVisible(true);
	}
	//��ư�� Ŭ�������� ���������� �ڵ����� ȣ��Ǵ� �޼���(�ݹ�޼���)
	/*ActionEvent ->�̺�Ʈ �߻� ������Ʈ ������ ���� �ִ� Ŭ������ü
	 * 1.�̺�Ʈ �߻���Ų ������Ʈ�� �̸�->e.getActionCommand()
	 * 2.�̺�Ʈ �߻���Ų ������Ʈ�� ����->e.getSource()->tf=>��ü����ȯ ���
	 */
	@Override
	public void actionPerformed(ActionEvent e) {//JButton or JTextField
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		String s=e.getActionCommand();
		//�߰�->�̺�Ʈ�� �߻���Ų ������Ʈ�� ���������� ->e.getSource()
		Object o=e.getSource();
		//�̺�Ʈ�� �߻���Ų���� ��ư�̶��
		if(o instanceof JButton) {
			JButton b=(JButton)o;//�θ�ü->(�ڽİ�üŬ������)
		//���۹�ư�� �����ٸ� ��ư�� ������ ������,���۹��ڿ��� â�� ���� ���
			if(s.contentEquals("����")) {
				//getConentPane()�� �ٴ°��->JFrame�� ���õ� ����ο��Ҷ�
				b.setBackground(Color.red);
				this.setTitle(s);
			}else if(s.contentEquals("��")) {
				b.setBackground(Color.yellow);
				this.setTitle(s);
			}else if(s.contentEquals("��")) {
				b.setBackground(Color.blue);
				this.setTitle(s);
			}else if(s.contentEquals("����")) {
				b.setBackground(Color.orange);
				this.setTitle(s);
			}
		}else {//�̺�Ʈ�߻���ü->JTextField
			JTextField tf2=(JTextField)o;
			tf2.setText("��ü����ȯ�� �߿��ؿ�!");//<->tf2.getText()
			setTitle(tf2.getText());
			//tf2.setText("");//�����
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             new ButtonEvent();//�͸�ü����
	}

}




