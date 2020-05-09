package j200212;

//�����
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//��������->1.Ŭ���̾�Ʈ���� ����->��������->���̵�� ����
//ServerSocket,Socket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Vector;//�����迭->�ǽð����� ������ Ŭ���̾�Ʈ��(�����迭X)

public class ChatGUIServer {
	
	ServerSocket ss;//Ŭ���̾�Ʈ���� �����Ҷ��� �ʿ�
	Socket s;//Ŭ���̾�Ʈ�� ���(���ڿ� ����)
    Vector v;//�ǽð����� ������ Ŭ���̾�Ʈ�� ������ ����
    
    //1.ServerThreadŬ������ ��ü�� �ʿ�->��������� ����->has a ����
    ServerThread st;
    //=============
    public ChatGUIServer() throws Exception { //��������� �ʱⰪ�� ����
    	//������ ����->Ŭ���̾�Ʈ�� �����Ҷ� ��ٸ���.(���ѷ���)->���Ѵ��
    	Properties props=new Properties();
    	FileInputStream in=new FileInputStream
    			("C:/webtest/3.java/sou/JavaStudy/src/j200212/port.properties");
    	String service="";//�ҷ��� ��Ʈ��ȣ�� ������ ����
    	/*�����->������ �ҷ��� �� �ִ� �������� üũ->available()->-1����(�� �ҷ����°��)
    	 *                                                                  �� �ҷ��� �� �ִ� ����(���)>0
    	 */
    	if(in!=null && in.available()>0) {//��� ��  ������ �����ϸ鼭 �ҷ��� ���ִ� ���¶��
    		props.load(in);
    		service=props.getProperty("port");//"1"
    	}
    	if("".contentEquals(service)) {//���������� ""�ΰ��
    		service="5432";//������ 5432�� ����ϰڴ�.
    	}
    	int port=Integer.parseInt(service);//"1"->1
    	switch (port) {
		case 1:
			     port=5432;
			break;
        //2
		case 2:
		     port=5000;
		break;	
	    //3
		case 3:
		     port=5500;
		break;
		
		default:
			 port=3000;
			break;
		}
    	System.out.println("port=>"+port);//5432
    	//-----------------------------------------------------------
    	v=new Vector();//�����ڿ����� �ٸ� Ŭ���� ��ü�� ����� ����
    	try {
    		//1.�������ϻ���->��Ʈ��ȣ�� �̿��ؼ� ����
    		//ss=new ServerSocket(5432);//7777(��Ʈ��ȣ�� ������ ��ȣ)
    		ss=new ServerSocket(port);
    		System.out.println("ss=>"+ss);
    		System.out.println("ä�ü��� ������....");
    		//���Ѵ��
    		while(true) {
    			s=ss.accept();//������ Ŭ���̾�Ʈ�� ������ ���� s
    			System.out.println("Accepted from "+s);
    			//������ �� ���Ŀ� ServerThread��ü�� ����
    			st=new ServerThread(this,s);
    			//������->�ڱ�Ŭ������ �ٸ� �޼���ȣ���Ҷ� ��ü�� ����->this
    			this.addThread(st);//�����Ҷ� ������ �޸𸮰����� Ŭ���̾�Ʈ������ ���Ϳ� ����
    			//Thread����
    			st.start();//->run()->broadCast()->send() �ǽð����� �޼���ȣ��
    		}
    	}catch(Exception e) {
    		System.out.println("�������� ����=>"+e);//e.getMessage()������ �����޼���
    		                                                         //e.toString()�߰�, 
    		                                                         //e.printStackTrace();
    	}
    }
    //1.���Ϳ� ������ Ŭ���̾�Ʈ���� ����->�Ű�����O,��ȯ��X
    public void addThread(ServerThread st) { //�޼����� �Ű������� ���� ������
    	v.add(st);
    }
    //2.������ Ŭ���̾�Ʈ�� ��������->���Ϳ��� ����(����)
    public void removeThread(ServerThread st) {
    	v.remove(st);//remove(������ ��ü��)
    }
    //3.�� Ŭ���̾�Ʈ���� �ǽð����� �޼����� ���޽����ִ� �޼���->�Ű����� O, ��ȯ��X
    public void broadCast(String str) {
    	for(int i=0;i<v.size();i++) {
    		ServerThread st=(ServerThread)v.elementAt(i);
    		st.send(str);
    	}
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
               new ChatGUIServer();//�͸�ü
	}
}
//�ǽð����� ����������->������ ����� �ʿ�
class ServerThread extends Thread{
	
	Socket s;//Ŭ���̾�Ʈ�� ���
	ChatGUIServer cg;//1.���� Ŭ������ ��ü ����->has a ����
	//�����
	BufferedReader br;//�뷮�� �Է¿�
	PrintWriter pw;//��¿�->BufferedWriter bw;
	String str;//������ ���ڿ�
	String name;//��ȭ��(id)
	
	//�������� ������->�����͸� �ǽð����� ����->����½�Ʈ������
	public ServerThread(ChatGUIServer cg,Socket s) {
		 //cg=new ChatGUIServer(); ���X 2.�޼����� �Ű������� �̿�
		this.cg=cg;
		this.s=s;//������ Ŭ���̾�Ʈ�� ����
		
		try {
			//s.getInputStream()=>������ ���->���������͸� �Է°�ü�� �޾ƿ;� �ȴ�.
			br=new BufferedReader
					 (new InputStreamReader(s.getInputStream()));//System.in(����)
		    //BufferedWriter->bw.write(��)->����Ҷ� ���
			//bw.flush();->���ۿ� ����� ���� �ٷιٷ� ����
			//1.���������ڿ��� ����� ��°�ü,2.autoflush(�ڵ����� ����� �Ǵ� ���)�� �������
			pw=new PrintWriter(s.getOutputStream(),true);
		}catch(Exception e) {
			System.out.println("�������(e)=>"+e);
		}
	}
	//�����͸� �������ִ� �޼���(Ŭ���̾�Ʈ)->broadCast(String str)->
	public void send(String str) {
		pw.println(str);//������ ������ ��� �����ڿ��� ���ÿ� ���
		pw.flush();
	}
	//�ǽð����� �����͸� �����ϱ����ؼ��� run()�� ������ �Ǿ�� �Ѵ�.
	@Override
	public void run() {//->broadCast(str)->send(str)
		// TODO Auto-generated method stub
		//��ȭ���� �Է�?->��ȭ��=>��� �����ڿ��� ���������� �˷��ش�.->����
		try {
			pw.println("���� ��ȭ���� �Է��ϼ���?");
			name=br.readLine();//<->������ Ŭ���̾�Ʈ�κ��� ����
			//�� Ŭ���̾�Ʈ���� Ư����ȭ���� �� ����ڰ� �����ߴٴ� �޼��� ����
			System.out.println("server���� ���޹��� name=>"+name);
			cg.broadCast("["+name+"]���� �����ϼ̽��ϴ�.");
			while((str=br.readLine())!=null) {//��� �Է��� �޴� ����
				cg.broadCast("["+name+"]"+str);//��ȭ��:������ ���ڿ�
			}
		}catch(Exception e) {//����� �����ڵ����� ����->�������� ����
			//�����ڰ� ����->������ ����鿡�� �ǽð� ����
			cg.removeThread(this);//ServerThread�� ��ü st(���� �����ؼ� ���������� ���)
			cg.broadCast("["+name+"]���� �����ϼ̽��ϴ�.");
			//������ ip�ּҸ� ���
			System.out.println(s.getInetAddress()+"�� ������ �����!");//�������� ip�ּ�
		}
	}
}

















