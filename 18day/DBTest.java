package j200212;

//����Ŭ�� ������ �������� Ȯ���غ��� ����
import java.sql.*;//DB�� ���õ� Ŭ�����ҷ��ö�->java.io.*,java.net.*,java.util.*
                           //����ó��->1.����� 2.��Ʈ��ũ 3.DB���� �� ó��

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //DB�� ���ӿ� ������ ����->Connection��ü��  �ʿ��ϴ�.(�α����Ҷ�)
		Connection con=null;
		//����)jdbc:oracle:thin:@������ ����ip:������Ʈ��ȣ(1521):SID(orcl)
		String url="jdbc:oracle:thin:@localhost:1521:orcl";//����Ŭ ����(�ڱ��)
		
		try {
			//1.������ ����̹��� �޸𸮿� �ø���(������Ű����.������Ű����..Ŭ������)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�����ϱ����ؼ� �α�������->1.���Ӱ�� 2.���Ӱ��� 3.��ȣ
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("���� con=>"+con);
			//���� con=>oracle.jdbc.driver.T4CConnection@2d38eb89
		}catch(Exception e) {
			System.out.println("DB�������(e)=>"+e);
		} 
		
	}

}





