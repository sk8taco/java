package j200205;
/*
 * ����ó��=>����� �۵��� �Ǵ��� ��� Ȯ�ΰ����Ѱ�?
 * �������� ���ܸ� �߻�->������ ����� �۵��� �Ǵ��� Ȯ���� �����ϴ�.
 * ����) throw new �߻���ų ����ó��Ŭ����(�����޼��� ��������)
 *       �޼����() throws ó������ ����ó��Ŭ������
 */
public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
           a();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �迭÷�ڿ��� �����غý��ϴ�.");
		}
		System.out.println("����ó�� ��������!");
	}

	static void a() { //NullPointerException�� �� ó�����ִ��� �˾ƺ���
		try {
			//String s="abc";//s���ڿ� ��ü
			/* (1) �������� �����ۼ�
			String s=null;
			System.out.println("���ڿ��� ����=>"+s.length());
			*/
			//(2)
			throw new NullPointerException("�������� ��������");
		}catch(NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("�޼��带 ȣ���ϱ����� ��ü���������� Ȯ�ο��!");
		}
		throw new ArrayIndexOutOfBoundsException("�迭÷�ڿ���");
	}
}




