package j200205;
/*
 * ����ó�� ��ü���� �Ұ� �� ��������
 */
public class ExceptionTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ű������� ���޹޾Ƽ� ó��(����)");
		try {//������ �߻����ɼ��� �ִ� ������ ������ ����
			int a=Integer.parseInt(args[0]);//"9"->9
			int b=Integer.parseInt(args[1]);//"a"->0
			
			System.out.println("a=>"+a+",b=>"+b);
			System.out.println("a�� b�� ���� ��=>"+(a/b));
		} catch (ArithmeticException e) { //���Ŀ��� 9/0���� �������
			System.out.println(e);//e.toString()
			System.out.println("9�� 0���� ���� ���� �����ϴ�.");
		} catch(IndexOutOfBoundsException | NumberFormatException e) {//�迭�� ÷�ڰ� �����߻�(�Ѱ��� �Է��Ѱ��)
			System.out.println(e);
			System.out.println("�ΰ��� �ݵ�� �Է��ϰų� ���ڸ� �Է��ؾ� �մϴ�.");
		}/* catch(NumberFormatException e) { //"9"=>9   "a"->(X) ���ڷ� ��ȯX
			System.out.println(e);
			System.out.println("�Է��� �ݵ�� ���ڰ� �ƴ� ���ڷ� �Է��ؾ� �մϴ�.");
		} */catch(Exception e) {//�ڽ�Ŭ�������� �߻��� ����ó���� �θ�Ŭ������ ���
			System.out.println(e.toString());
			System.out.println("���� ����ó������ ������ ��θ� ó���մϴ�.");
		}finally {
			System.out.println("�����߻� ������ ������� �ݵ�� ó���ؾ��� ������ �ʿ��Ѱ�� ���");
		    //�޸�����->con.close(),rs.close();
		}
	}

}




