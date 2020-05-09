package j200211;

import java.net.*;//SocketŬ����(��Ʈ��ũ�� ��������ִ� ������ �ϴ� Ŭ����)
import java.io.*;//�����
import java.awt.*;//GUI
import javax.swing.*;//JFrame,JTextField, JTextArea,JScrollPane�ʿ�
import java.awt.event.*;//eventó��

public class ChatGUIClient extends JFrame implements ActionListener,Runnable{

	JTextField tf;//�Է�
	JTextArea ta;//Ŭ���̾�Ʈ���� ��ȭ�� ���
	//�߰�
	JScrollPane js;//��ũ�ѹ� ���������� �ʿ�
	//----�߰�--------
	Socket s;//������ ����ϱ� ���ؼ� 
	//----------------
	public ChatGUIClient() {
		//â �� ������ų ������Ʈ�� ����->����
		tf=new JTextField();
		ta=new JTextArea();
		js=new JScrollPane(ta);//JTextArea�� ��ũ�ѹٸ� ��ɰ���
		//����->��ġ������(BorderLayout)
		add(js,"Center");//JTextArea�� ���߾ӿ� ��ġ
		add(tf,"South");//BorderLayout.SOUTH
		tf.addActionListener(this);
		setBounds(200,200,500,350);
		setVisible(true);
		tf.requestFocus();//Ŀ���Է�
		//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ �����ϴ� ����
		try {
			//1.������ ��ǻ���� ip�ּ� (192.168.0.35),2.��Ʈ��ȣ(5432)
			s=new Socket("192.168.0.35",5432);
			System.out.println("s="+s);
			//---------------------------------------
		}catch(Exception e) {
			System.out.println("���ӿ���=>"+e);
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



