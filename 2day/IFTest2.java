package j200116;

import java.util.*;

public class IFTest2 {
	public static void main(String[] args) {
		System.out.println("if중첩문");
		System.out.print("1~100 사이의 정수에서 판별할 값을 입력하세요:");
		Scanner in = new Scanner(System.in);

		int su = in.nextInt();
		
		// 조건1 -> 1~100까지의 입력을 받는 조건하에 짝수 ,홀수를 판별하시오
		// 조건2 -> 1~100까지의 범위에들지 않는 숫자 => 반드시 1~100의 숫자만 입력받습니다.
		// Ctrl+A:전체블럭지정 / Ctrl+Shift+F :자동정렬
		if ((su <= 100) && (su >= 1)) {
			System.out.println("범위 내에 값을 입력하였습니다.");
			if (su % 2 == 0) {
				System.out.println(su + "는 짝수입니다.");
			} else {
				System.out.println(su + "는 홀수입니다");
			}
		} else {
			System.out.println("범위를 초과하였습니다. 종료됩니다.");
			return;
		}
	}
}
