package j200116;

import java.util.*;

public class IFTest2 {
	public static void main(String[] args) {
		System.out.println("if��ø��");
		System.out.print("1~100 ������ �������� �Ǻ��� ���� �Է��ϼ���:");
		Scanner in = new Scanner(System.in);

		int su = in.nextInt();
		
		// ����1 -> 1~100������ �Է��� �޴� �����Ͽ� ¦�� ,Ȧ���� �Ǻ��Ͻÿ�
		// ����2 -> 1~100������ ���������� �ʴ� ���� => �ݵ�� 1~100�� ���ڸ� �Է¹޽��ϴ�.
		// Ctrl+A:��ü������ / Ctrl+Shift+F :�ڵ�����
		if ((su <= 100) && (su >= 1)) {
			System.out.println("���� ���� ���� �Է��Ͽ����ϴ�.");
			if (su % 2 == 0) {
				System.out.println(su + "�� ¦���Դϴ�.");
			} else {
				System.out.println(su + "�� Ȧ���Դϴ�");
			}
		} else {
			System.out.println("������ �ʰ��Ͽ����ϴ�. ����˴ϴ�.");
			return;
		}
	}
}
