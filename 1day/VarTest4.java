package j200115;
//변수,상수(constant)
public class VarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("변수의 특성");
		//한번에 주석을 지정 : 범위를 지정한 후 ctrl+shift+/ 
		//주석을 푸는 방법 : 범위를 지정한 후 ctrl+shift+\ 
		// int num; int num2; int num3;
		int num,num2=3,num3=4; // 같은 자료형은 , 로 나열해서 사용할 수 있다. 
		System.out.println("num2:"+num2+",num3:"+num3);
		// System.out.println("num:"+num); 값이 초기화 되어 있지 않다.
		// 값을 출력시키기 위해서는 먼저 값을 저장, 초기화 해야한다.
		num=10;
		System.out.println("num:"+num);
		num=23;
		System.out.println("num:"+num);// 변수는 제일 마지막 값만을 기억함
		// 상수 : 값이 정해지면 중간에 값이 변경이 되지 않는 것
		int num4=5, num5=6;
		
		
		/*
		 변수에 값을 저장 => 중간에 값을 바꿀 수 없게 : 상수화된 변수 > 전부 대문자로 표현
		 형식) 
		 final 자료형 변수명 = 값(고정) 
		 */
		final int NUM6 = 40;
		System.out.println(NUM6);
		
	}

}
