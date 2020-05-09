package j200116;
import java.util.*;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("if중첩문");
		System.out.print("판별할 값을 입력하세요:");
		Scanner in = new Scanner(System.in);
		
		int su = in.nextInt();
		
		/* (1) 이프문
		if (su % 2 == 0) {
			System.out.println(su + "는 짝수입니다.");
		} else {
			System.out.println(su + "는 홀수입니다");
		}
		*/
		
		// switch~case문
		switch (su%2) { // 하나의 조건식 -> 처리해야할 내용이 가능한 적게 나오는 조건
		case 0:
			System.out.println(su + "는 짝수입니다.");
			break;
		case 1:
			System.out.println(su + "는 홀수입니다");
			break;
		}
		System.out.println("case문 종료");
		return;		
	}
}
