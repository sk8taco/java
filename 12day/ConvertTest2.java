package j200204;

import java.util.Scanner;

public class ConvertTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���ڿ��� �Է��ϼ���?");// nextLine()����, next() �ܾ��߽�
			// String input=sc.nextLine();//"hello" �����ν� O
			String input = sc.next();// �����ν�X
			// ----���ڿ���(equals(��,�ҹ��ڱ���) equalsIgnoreCase(��ҹ��� ����X)
			// contentEquals(��,�ҹ��ڱ���)-----
			if (input.contentEquals("e") || input.equals("E")) {
				System.out.println("���α׷��� ���������� ����˴ϴ�.");
				System.exit(0);// ��������
			}
			// -----------------------------
			char ch;// �̾Ƴ����� ���� ����
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				// ch->isXXXx(char)=boolean
				// isWhitespace(char)->�������� �ƴ��� üũ, isDigit(char)->�������� �ƴ���üũ
				if (Character.isDigit(ch)) { // ���ڶ��
					System.out.println("�����ڸ� �Է��� �����մϴ�.");
					System.out.println("���α׷� �ڵ� ����˴ϴ�.");
					return;// Ż�⹮
				} else {
					if (Character.isLowerCase(ch)) // �ҹ��ڶ��
						System.out.print(Character.toUpperCase(ch));
					else
						System.out.print(Character.toLowerCase(ch));
				}
				// System.out.println("ch=>"+ch);
			} // for
			System.out.println();// �ٹٲ�
		} // while
	}
}
