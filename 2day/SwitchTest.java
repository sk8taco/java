package j200116;
import java.util.*;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("if��ø��");
		System.out.print("�Ǻ��� ���� �Է��ϼ���:");
		Scanner in = new Scanner(System.in);
		
		int su = in.nextInt();
		
		/* (1) ������
		if (su % 2 == 0) {
			System.out.println(su + "�� ¦���Դϴ�.");
		} else {
			System.out.println(su + "�� Ȧ���Դϴ�");
		}
		*/
		
		// switch~case��
		switch (su%2) { // �ϳ��� ���ǽ� -> ó���ؾ��� ������ ������ ���� ������ ����
		case 0:
			System.out.println(su + "�� ¦���Դϴ�.");
			break;
		case 1:
			System.out.println(su + "�� Ȧ���Դϴ�");
			break;
		}
		System.out.println("case�� ����");
		return;		
	}
}
