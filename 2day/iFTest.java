package j200116;
import java.util.*;

public class iFTest {
	public static void main(String[] args) {
		System.out.println("if��(���ǹ�)");
		
		System.out.print("�Ǻ��� ���� �Է��ϼ���:");
		Scanner in = new Scanner(System.in);
		
		int su=in.nextInt(); //����ڷκ��� ���� �Է¹޾Ƽ� ó��-> Scanner O or ����¿��� �۾�
		//if(���ǽ�(����,����,(����,��)) { ó���� ���� -> 2�ǹ��(%), 3�ǹ��,,,}
		/*
		 * if(su%2 ==0)	: ���ǽ��� 1�� �϶�		 
			System.out.println("�Է��Ͻ� ��"+su+"�� ¦���Դϴ�.");
		*/
		if (su%2 == 0 ) { // ���ǿ� ���� ó���� ���忡 1�� �̻��� �� ��ó��
			System.out.println(su+"�� ¦���Դϴ�.");
			System.out.println("��ó�� ����1");
		}
		else {	// su%2 == 1
			System.out.println(su+"�� Ȧ���Դϴ�.");
			System.out.println("��ó�� ����2");
		}
		System.out.println("���׿����ڷ� ����");
		String su2 = (su%2==0)? "¦��" :"Ȧ��" ;
		System.out.println("�Է¹��� ��(su2)��"+su2+"�Դϴ�.");
		return;
	}
}
