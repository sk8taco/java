package j200204;

import java.util.Scanner;

public class ConvertTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열을 입력하세요?");// nextLine()문장, next() 단어중심
			// String input=sc.nextLine();//"hello" 공백인시 O
			String input = sc.next();// 공백인식X
			// ----문자열비교(equals(대,소문자구분) equalsIgnoreCase(대소문자 구분X)
			// contentEquals(대,소문자구분)-----
			if (input.contentEquals("e") || input.equals("E")) {
				System.out.println("프로그램이 정상적으로 종료됩니다.");
				System.exit(0);// 정상종료
			}
			// -----------------------------
			char ch;// 뽑아낸글자 담을 변수
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				// ch->isXXXx(char)=boolean
				// isWhitespace(char)->공백인지 아닌지 체크, isDigit(char)->숫자인지 아닌지체크
				if (Character.isDigit(ch)) { // 숫자라면
					System.out.println("영문자만 입력이 가능합니다.");
					System.out.println("프로그램 자동 종료됩니다.");
					return;// 탈출문
				} else {
					if (Character.isLowerCase(ch)) // 소문자라면
						System.out.print(Character.toUpperCase(ch));
					else
						System.out.print(Character.toLowerCase(ch));
				}
				// System.out.println("ch=>"+ch);
			} // for
			System.out.println();// 줄바꿈
		} // while
	}
}
