package j200120;

//추상화 -> 새로운 자료형을 만드는 
public class Car {
		//공통특성 -> 기본자료형 8가지를 이용 (멤버변수: 클래스 내부에 선언된 변수)
		String name; 
		int output;	//배기량
		int year; //년식
		String color; //차의 색상
		//현재 상태
		int current_speed; // 차의 속도
		//	int -> 1,0
		boolean sidong = false;
		
		//1. 차의 시동걸기 -> 단순하고 반복적인 일 (매개변수X,반환값X)
		void startEnginee(){
			sidong = true;
			System.out.println("시동이 걸림!"+sidong);
			}
		
		//2.차의 속도증가
		void speedUp(int speed) { // 매개변수 O  반환값 X -> 속도를 입력받아서 내부적으로 계산, 저장
			current_speed+=speed;
			System.out.println(speed+"km만큼 속도가 증가되었습니다.");
		}
		
		//3.차의 속도감속
		void speedDown(int speed) {
			current_speed-=speed;
			System.out.println(speed+"km만큼 속도가 감소되었습니다.");
		}
		//4.차의 정보 출력
		void carInfoPrint() { // 매개면수 X 반환값 X
			System.out.println("===차의 정보===");
			System.out.println("차의 이름은="+name);			
			System.out.println("차의 배기량="+output+"cc");
			System.out.println("차의 색상="+color);			
			System.out.println("차의 속도="+current_speed);
			System.out.println("차의 시동유무="+sidong);
		}
		//5. 주차
		void stop() {
			sidong=false;
			current_speed=0;
			System.out.println("정상적으로 주차가 완료되었습니다.");
		}
}
