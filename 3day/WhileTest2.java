package j200117;

import java.util.*;

//��ø ��� -> ��øif, ��ø if-while
public class WhileTest2 {
	public static void main(String[] args) {
		System.out.print("���۰��� �Է��ϼ���: ");		
		Scanner in = new Scanner (System.in);
		int i;
		i = in.nextInt();	
		int e = 20;
		if (i > 20) {
			System.err.println("���ᰪ���� ū ���� �Է��ϼ̽��ϴ�.");
			return;
		} else {
			while (i <= e) {
				System.out.println("while ���� ����" + i);
				i++;
			}
			System.out.println(i);
		}
	}

}
