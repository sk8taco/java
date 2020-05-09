package j200117;

import java.util.*;

//중첩 제어문 -> 중첩if, 중첩 if-while
public class WhileTest2 {
	public static void main(String[] args) {
		System.out.print("시작값을 입력하세요: ");		
		Scanner in = new Scanner (System.in);
		int i;
		i = in.nextInt();	
		int e = 20;
		if (i > 20) {
			System.err.println("종료값보다 큰 값을 입력하셨습니다.");
			return;
		} else {
			while (i <= e) {
				System.out.println("while 구문 연습" + i);
				i++;
			}
			System.out.println(i);
		}
	}

}
