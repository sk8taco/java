package j200115;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var age;  <-- javascript�� �ڷ����� ���� �ʴ´�. -> TypeScript 
		int age; // �������� (=������ �� �ִ� ������ ��������� ��)
		age = 33;
		System.out.println("�� ���̴�" + age + "�Դϴ�.");
		byte b=23; // ���� b�� �����ϸ鼭 23���� �����϶�
		short c=12; // -32767 ~ 32767
		int sum = b+c;	// var sum = b+c; <-- javascript
								// b+c ������ �ϰ� �ֱ� ������, ������ �⺻�ڷ��� (default) int �� �ν�
		//byte sum = b+c; // byte���� ���꿡 ���� ������� ���� ������.
		//�ڹ��� �������� �ڷ����� ���� �ʴ� ���� ���� -> Type mismatch(��ġX)
		System.out.println("sum�� ��=>" + sum);
		/// �ֹε�Ϲ�ȣ ����
		//int no = 1234568900000; 21���� �Ѿ���
		long no = 1234568900000L; // long�� ��� ���ڿ� l Ȥ�� L�� �ٿ��ش�
		System.out.println("no=>"+no);
		
	}	

}
