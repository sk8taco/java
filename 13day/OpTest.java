package j200205;

import java.util.Scanner;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a,b;//ù��,�ι�°�� ����
        char op;//"+"=>'+'=>charAt(�ε�����ȣ)
        /* (1)
        System.out.println("ù���� �Է�?");
        a=sc.nextInt();
        //������?
        System.out.println("������[+,-,*,/]");
        String s=sc.next();//"+" =>if(s.contentEquals("+")) a+b ~ else if
        op=s.charAt(0);
        
        System.out.println("�ι�°���� �Է�?");
        b=sc.nextInt();
        */
        //(2)nextLine()�� �̿��ϴ� ���
        System.out.println("ù���� �Է�?");
        a=Integer.parseInt(sc.nextLine()); //"10"->10->"10"(String.valueOf(10)
        //������?
        System.out.println("������[+,-,*,/]");
        String s=sc.nextLine();//"+" =>if(s.contentEquals("+")) a+b ~ else if
        op=s.charAt(0);
        
        System.out.println("�ι�°���� �Է�?");
        b=Integer.parseInt(sc.nextLine());
        
        switch (op) { //'+'->�ƽ�Ű�ڵ尪 ���
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		// -
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;	
		// *
		case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;	
		// /
		case '/':
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		}//switch
	}
}







