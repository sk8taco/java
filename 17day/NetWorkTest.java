package j200211;

//���
import java.net.*;//InetAddress,Socket,ServerSocket

public class NetWorkTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //www.naver.com->ip�ּ�
		InetAddress ia=null;
		InetAddress ia2[];//��ǻ�Ͱ� �Ѵ��̻��� �ּҸ� ����(������)
		//������ǻ�Ϳ� ����->�������̸�->ex)����->���� ip�ּ� ���ٱ���
		ia=InetAddress.getByName("www.naver.com");//unKnownHostException
		System.out.println("�����ּ�->"+ia.getHostAddress());//203.133.167.16
		//������ �Ѵ��̻�->getAllByName
		System.out.println("=====================");
		ia2=InetAddress.getAllByName("www.naver.com");
		//Ȯ�� for��
		for(InetAddress aa:ia2)
			System.out.println("������ �ּ�=>"+aa.getHostAddress());
		System.out.println("===�ڱ� ��ǻ���� ����===");
		InetAddress host=InetAddress.getLocalHost();//�ڱ� ��ǻ�� ����
		System.out.println("�� ��ǻ�͸�=>"+host.getHostName());//���ڿ�
		System.out.println("�� ip�ּ�=>"+host.getHostAddress());//����
	}
}





