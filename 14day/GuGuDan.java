package j200206;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) { //for(;;) 무한루프->빠져나갈 조건 줘야 된다. Q or q
			int i=1;//1~9(열)
			Scanner sc=new Scanner(System.in);
			System.out.println("출력할 단을 입력?");//Q or q=>동시에 입력
			String str=sc.nextLine();//next()도 가능
			if(str.contentEquals("q") || str.equals("Q"))
				System.exit(0);//정상 종료
			int j=Integer.parseInt(str);//"2"->2
			//1~9(0,>=9)
			//-------------------------------------------------------
			if(j<=0 || j>9) {
				System.out.println("단은 음수이거나 9단이상은 입력불가");
				return;
			}//if
			//-------------------------------------------------------
			System.out.println("===구구단===");
			System.out.println("=="+j+"단==");
			while(i<=9) {
				System.out.println(j+"*"+i+"="+(j*i));
				i++;
			}//inner while
		}//outer while
	}
}





