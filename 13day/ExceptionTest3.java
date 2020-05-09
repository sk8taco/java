package j200205;
/*
 * 예외처리=>제대로 작동이 되는지 어떻게 확인가능한가?
 * 가상으로 예외를 발생->구문이 제대로 작동이 되는지 확인이 가능하다.
 * 형식) throw new 발생시킬 예외처리클래스(에러메세지 문자형태)
 *       메서드명() throws 처리해줄 예외처리클래스명
 */
public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
           a();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("가상으로 배열첨자오류 연습해봤습니다.");
		}
		System.out.println("예외처리 최종종료!");
	}

	static void a() { //NullPointerException을 잘 처리해주는지 알아보자
		try {
			//String s="abc";//s문자열 객체
			/* (1) 실질적인 구문작성
			String s=null;
			System.out.println("문자열의 길이=>"+s.length());
			*/
			//(2)
			throw new NullPointerException("널포인터 에러연습");
		}catch(NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("메서드를 호출하기전에 객체생성유무를 확인요망!");
		}
		throw new ArrayIndexOutOfBoundsException("배열첨자오류");
	}
}




