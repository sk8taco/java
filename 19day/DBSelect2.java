package j200213;

//1.DB����->1.���̺��� ����->2.�Է�->3.�˻�->4.���
import java.sql.*; //DB���� ��Ű��

public class DBSelect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;//DB������ ������� �� ���
		//����)jdbc:oracle:thin:@������ ����ip:������Ʈ��ȣ(1521):SID(orcl)
		String url="jdbc:oracle:thin:@localhost:1521:orcl";//����Ŭ ����(�ڱ��)
		//�߰�
		Statement stmt=null;//create table~
		PreparedStatement pstmt=null;//insert into~?,?,?
		Statement stmt2=null;//select����->ǥ����
		ResultSet rs=null;//select �˻������ ǥ���·� �����ش�.
		String sql="";//sql������ ����
		
		try {
			//1.������ ����̹��� �޸𸮿� �ø���(������Ű����.������Ű����..Ŭ������)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�����ϱ����ؼ� �α�������->1.���Ӱ�� 2.���Ӱ��� 3.��ȣ
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("���� con=>"+con);
			//���� con=>oracle.jdbc.driver.T4CConnection@2d38eb89
			//3.���̺��� ����->create table->stmt
			stmt=con.createStatement();//�޼����� ��ȯ��
			sql="create table MyTest(name varchar2(20),age number)";
			int create=stmt.executeUpdate(sql);
			System.out.println("���̺� ��������(create)=>"+create);
			//4.insert
			//sql="insert into Mytest values(?,?)";
			pstmt=con.prepareStatement("insert into Mytest values(?,?)");
			//����)pstmt��ü��.setString(or setInt,setDouble,,,(?�� ����,�Է��Ұ�)
			pstmt.setString(1, "hong");//pstmt.setString(1,tf1.getText())
			pstmt.setInt(2, 23);
			int insert=pstmt.executeUpdate();//1=>����,0=>����
			System.out.println("�����Ͱ� �Է¼�������(insert)=>"+insert);
		}catch(Exception e) {
			System.out.println("DB�������(e)=>"+e);
		} 
	}
}
