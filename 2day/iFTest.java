package j200116;
import java.util.*;

public class iFTest {
	public static void main(String[] args) {
		System.out.println("if문(조건문)");
		
		System.out.print("판별할 값을 입력하세요:");
		Scanner in = new Scanner(System.in);
		
		int su=in.nextInt(); //사용자로부터 값을 입력받아서 처리-> Scanner O or 입출력에서 작업
		//if(조건식(변수,수식,(관계,논리)) { 처리할 문장 -> 2의배수(%), 3의배수,,,}
		/*
		 * if(su%2 ==0)	: 조건식이 1개 일때		 
			System.out.println("입력하신 값"+su+"는 짝수입니다.");
		*/
		if (su%2 == 0 ) { // 조건에 따라서 처리할 문장에 1개 이상일 때 블럭처리
			System.out.println(su+"는 짝수입니다.");
			System.out.println("블럭처리 연습1");
		}
		else {	// su%2 == 1
			System.out.println(su+"는 홀수입니다.");
			System.out.println("블럭처리 연습2");
		}
		System.out.println("삼항연산자로 변경");
		String su2 = (su%2==0)? "짝수" :"홀수" ;
		System.out.println("입력받은 값(su2)는"+su2+"입니다.");
		return;
	}
}
