package j200206;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) { //for(;;) ���ѷ���->�������� ���� ��� �ȴ�. Q or q
			int i=1;//1~9(��)
			Scanner sc=new Scanner(System.in);
			System.out.println("����� ���� �Է�?");//Q or q=>���ÿ� �Է�
			String str=sc.nextLine();//next()�� ����
			if(str.contentEquals("q") || str.equals("Q"))
				System.exit(0);//���� ����
			int j=Integer.parseInt(str);//"2"->2
			//1~9(0,>=9)
			//-------------------------------------------------------
			if(j<=0 || j>9) {
				System.out.println("���� �����̰ų� 9���̻��� �ԷºҰ�");
				return;
			}//if
			//-------------------------------------------------------
			System.out.println("===������===");
			System.out.println("=="+j+"��==");
			while(i<=9) {
				System.out.println(j+"*"+i+"="+(j*i));
				i++;
			}//inner while
		}//outer while
	}
}





