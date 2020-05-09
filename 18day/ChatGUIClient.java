package j200212;

import java.net.*;//SocketŬ����(��Ʈ��ũ�� ��������ִ� ������ �ϴ� Ŭ����)
import java.util.Properties;
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
	BufferedReader br;//�Է¿�(��뷮)
	PrintWriter pw;//��¿�
	String str,str1;//����,��ȭâ�� ����� ���ڿ�
	//----------------
	public ChatGUIClient() {
		//â �� ������ų ������Ʈ�� ����->����
		tf=new JTextField();
		ta=new JTextArea();
		js=new JScrollPane(ta);//JTextArea�� ��ũ�ѹٸ� ��ɰ���
		//����->��ġ������(BorderLayout)
		add(js,"Center");//JTextArea�� ���߾ӿ� ��ġ
		add(tf,"South");//BorderLayout.SOUTH
		tf.addActionListener(this);//�̺�Ʈó��
		setBounds(200,200,500,350);
		setVisible(true);
		tf.requestFocus();//Ŀ���Է�
		//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����
		//������ �����ϴ� ����
		try {
			//1.������ ��ǻ���� ip�ּ� (192.168.0.35),2.��Ʈ��ȣ(5432)
			Properties props=new Properties();
	    	FileInputStream in=new FileInputStream
	    			("C:/webtest/3.java/sou/JavaStudy/src/j200212/port.properties");
	    	String ip="";//�ҷ��� ip�ּҸ� ������ ����
	    	
	    	if(in!=null && in.available()>0) {//��� ��  ������ �����ϸ鼭 �ҷ��� ���ִ� ���¶��
	    		props.load(in);
	    		ip=props.getProperty("ip");//�ҷ��� ip
	    	}
			//--------------------------------------------------------
			s=new Socket(ip,5432);
			System.out.println("s="+s);
			//-----������ ������ ���ִ� ������� ����----------------------------------
			br=new BufferedReader
					 (new InputStreamReader(s.getInputStream()));//System.in(����)
			System.out.println("client�� br=>"+br);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			System.out.println("client�� pw=>"+pw);
			
		}catch(Exception e) {
			System.out.println("���ӿ���=>"+e);
		}
		//Thread��ü�� ����->run()ȣ��
		Thread ct=new Thread(this);//ChatGUIClient��ü->Runnable��ü
		System.out.println("client�� ct��ü����(ct)=>"+ct);
		ct.start();//run()
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//���̻� �Է��� ���� �� ���������� ->JTextArea(ä��â�� ���)=>String
		try {
			while((str1=br.readLine())!=null) {
				ta.append(str1+"\n");//������ �����ر���(str1)�� ���η� ä��â�� ���
			}
		}catch(Exception e) {e.printStackTrace();}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		str=tf.getText();//���� ������
		tf.setText("");//�����->������ �Է�
		pw.println(str);//����->br.readLine()
		pw.flush();//���ۿ� ����� ���� �ִٸ� �ٷιٷ� ����϶�.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatGUIClient();
	}
}



