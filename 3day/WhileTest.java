package j200117;
// �ݺ��� Ƚ���� ������ �ִ� ��� => �ݺ� ������ ���ϴ� ���� : ���μ��� �������� ��ǻ�� ����ӵ� ����
public class WhileTest {
	public static void main(String[] args) {
		/*
		 * System.out.println("while ���� ����1"); System.out.println("while ���� ����2");
		 * System.out.println("while ���� ����3"); System.out.println("while ���� ����4");
		 * System.out.println("while ���� ����5");
		 */
		
		int i = 10; // �ݺ��� Ƚ���� �ʿ�
		/*
		 * while(i<=5) { System.out.println("while ���� ����"+i); i++; }
		 */
		do {
			System.out.println("while ���� ����"+i);
			i++;
		}while(i<=5);
		System.out.println("while ���� ����");
	}
}
