package j200211;

//��������->1.Ŭ���̾�Ʈ���� ����->��������->���̵�� ����
import java.net.*;//ServerSocket,Socket;
import java.io.*;//�����
import java.util.Vector;//�����迭->�ǽð����� ������ Ŭ���̾�Ʈ��(�����迭X)

public class ChatGUIServer {
	
	ServerSocket ss;//Ŭ���̾�Ʈ���� �����Ҷ��� �ʿ�
	Socket s;//Ŭ���̾�Ʈ�� ���(���ڿ� ����)
    Vector v;//�ǽð����� ������ Ŭ���̾�Ʈ�� ������ ����
    
    //1.ServerThreadŬ������ ��ü�� �ʿ�->��������� ����->has a ����
    ServerThread st;
    //=============
    public ChatGUIServer() { //��������� �ʱⰪ�� ����
    	//������ ����->Ŭ���̾�Ʈ�� �����Ҷ� ��ٸ���.(���ѷ���)->���Ѵ��
    	v=new Vector();//�����ڿ����� �ٸ� Ŭ���� ��ü�� ����� ����
    	try {
    		//1.�������ϻ���->��Ʈ��ȣ�� �̿��ؼ� ����
    		ss=new ServerSocket(5432);//7777(��Ʈ��ȣ�� ������ ��ȣ)
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
    	
    }
	public static void main(String[] args) {
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
	
	public ServerThread(ChatGUIServer cg,Socket s) {
		 //cg=new ChatGUIServer(); ���X 2.�޼����� �Ű������� �̿�
	}
	//�����͸� �������ִ� �޼���(Ŭ���̾�Ʈ)
	public void send(String str) {
		
	}
	//�ǽð����� �����͸� �����ϱ����ؼ��� run()�� ������ �Ǿ�� �Ѵ�.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

















