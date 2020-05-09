package j200117;
// 반복할 횟수가 정해져 있는 경우 => 반복 문장을 피하는 이유 : 라인수가 많아지면 컴퓨터 실행속도 저하
public class WhileTest {
	public static void main(String[] args) {
		/*
		 * System.out.println("while 구문 연습1"); System.out.println("while 구문 연습2");
		 * System.out.println("while 구문 연습3"); System.out.println("while 구문 연습4");
		 * System.out.println("while 구문 연습5");
		 */
		
		int i = 10; // 반복할 횟수가 필요
		/*
		 * while(i<=5) { System.out.println("while 구문 연습"+i); i++; }
		 */
		do {
			System.out.println("while 구문 연습"+i);
			i++;
		}while(i<=5);
		System.out.println("while 구문 종료");
	}
}
