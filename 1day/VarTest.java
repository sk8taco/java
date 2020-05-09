package j200115;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var age;  <-- javascript는 자료형을 쓰지 않는다. -> TypeScript 
		int age; // 변수선언 (=저장할 수 있는 공간이 만들어지는 것)
		age = 33;
		System.out.println("제 나이는" + age + "입니다.");
		byte b=23; // 변수 b를 선언하면서 23값을 저장하라
		short c=12; // -32767 ~ 32767
		int sum = b+c;	// var sum = b+c; <-- javascript
								// b+c 연산을 하고 있기 때문에, 연산은 기본자료형 (default) int 로 인식
		//byte sum = b+c; // byte형은 연산에 대한 결과값을 넣을 수없다.
		//자바의 변수값에 자료형과 맞지 않는 값을 저장 -> Type mismatch(일치X)
		System.out.println("sum의 값=>" + sum);
		/// 주민등록번호 저장
		//int no = 1234568900000; 21억을 넘어간드아
		long no = 1234568900000L; // long의 경우 값뒤에 l 혹은 L을 붙여준다
		System.out.println("no=>"+no);
		
	}	

}
