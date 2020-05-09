package j200205;

import java.util.Scanner;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a,b;//첫수,두번째수 저장
        char op;//"+"=>'+'=>charAt(인덱스번호)
        /* (1)
        System.out.println("첫수를 입력?");
        a=sc.nextInt();
        //연산자?
        System.out.println("연산자[+,-,*,/]");
        String s=sc.next();//"+" =>if(s.contentEquals("+")) a+b ~ else if
        op=s.charAt(0);
        
        System.out.println("두번째수를 입력?");
        b=sc.nextInt();
        */
        //(2)nextLine()을 이용하는 경우
        System.out.println("첫수를 입력?");
        a=Integer.parseInt(sc.nextLine()); //"10"->10->"10"(String.valueOf(10)
        //연산자?
        System.out.println("연산자[+,-,*,/]");
        String s=sc.nextLine();//"+" =>if(s.contentEquals("+")) a+b ~ else if
        op=s.charAt(0);
        
        System.out.println("두번째수를 입력?");
        b=Integer.parseInt(sc.nextLine());
        
        switch (op) { //'+'->아스키코드값 취급
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







