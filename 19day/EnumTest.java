package j200213;

public class EnumTest {
    //요일(월~일),월(1~12월),시간(1~24)->변수에 저장->출력
	 public static final int SUN=0;
     public static final int MON=3;//1.숫자대신에 문자열 상수로 지정(기억하기쉽다.)
	 public static final int TUE=2;//2.한꺼번에 여러개의 변수를 동시에 수정할때
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int su1,su2,su3,su4;//배열
		 su1=SUN;//su1=0
		 su2=MON;//su2=1;
		 System.out.println("su1=>"+su1+",su2=>"+su2);
		 su3=MON; su4=MON;
		 System.out.println("su3=>"+su3+",su4->"+su4);
		 //사용1=>열거형클래스명.열거형 상수 지정
		 System.out.println("===외부의 enum(열거형)을 사용하는 경우===");
		 System.out.println("Day.SUN=>"+Day.SUN);//클래스명.항목->항목문자열출력
		 //열거형 항목에 해당하는 숫자가 출력
		 System.out.println("Day.SUN.ordinal()=>"+Day.SUN.ordinal());
		 //사용2=>열거형 객체명=열거형클래스명.열거형 항목->특정 제어문에서도 사용이 가능
		 Day d=Day.SUN;//SUN
		 su3=Day.SUN.ordinal();//su3=0와 같다.
		 
		 switch(d) {
		     //case 열거형클래스명.항목 (X)
		 case SUN:System.out.println("일요일");break;
		 case MON:System.out.println("월요일");break;
		 }
	}

}



