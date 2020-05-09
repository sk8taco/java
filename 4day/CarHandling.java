package j200120;
//설계도 역할(Car) => 자동차를 생산
//서로 연관이 있는 클래스는 한 폴더(=같은 패키지)에 저장
public class CarHandling {

	public static void main(String[] args) {
		//1. 자동차 조립(=객체 생성)
		// 객체생성 -> 객체(저장할 대상자)를 저장할 수 있는 공간을 만들어주는 것. (4Byte)
		//형식) 설계도 이름(=클래스 이름) 객체명(=변수) = new 클래스명();
		int age; // 4byte 기억공간이 생성
		//Car morning; // 객체 선언(기억공간이 아직 생성이 안된 상태
		Car morning = new Car(); // morning이 저장할 공간이 하나 생성 -> 4byte 기억공간
		//j200120.Car@15db9742 =>패키지명.클래스명@16진수
		//사람이라면 : 서울시 ~구 ~아파트 ~동 ~호
		System.out.println("morning의 값="+morning);
		
		//2. 객체명.멤버변수 = 입력할 값 => 자동차 공장
		morning.name ="모닝";
		morning.output=1000;
		morning.color="blue";
		morning.year=2020;
		
		//4. 운전 -> 시동걸기-> 차의 속도증가(메서드 호출) -> 객체명.호출할 메서드명() Or (~);
		morning.startEnginee();
		morning.speedUp(150); // 매개변수-> 메서드가 처리해야할 값들
		morning.speedDown(60 );
		System.out.println(morning.current_speed+"km");
		
		System.out.println("======================================");
		System.out.println("차이름=>"+morning.name);
		System.out.println("차배기량=>"+morning.output);
		System.out.println("차의 현재속도=>"+morning.current_speed);
		System.out.println("======================================");
		
		morning.carInfoPrint();	// 업무지시내림=>메서드 호출
		
		
		
		
		
	}

}
