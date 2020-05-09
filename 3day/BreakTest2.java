package j200117;

public class BreakTest2 {

	public static void main(String[] args) {
		System.out.println("레이블이 있는 브레이크문");
		A://형식) 레이블명:
		for(int a=0; a<5;a++) {
			for(int b=0;b<5;b++) {
				if(b==2) 
					break A;//형식)조건식에 맞는 문장 break 레이블명;
								// 해당 반복문을 빠져나가 A 포인트로 간뒤
								//반복문을 건너뛰어 다음 코드를 실행한다.
				System.out.println("a="+a+",b="+b); 
			}//inner for
			System.out.println("===============");
		}//outer for
		System.out.println("이중 for문 종료");
	}

}
