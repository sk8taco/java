package j200207;

//Wrapper class
public class BoxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("자동 unboxing");
         //unboxing=>자바의 객체형(Wrapper)-->기본 자료형으로 변환
         //int obj=10;
         Integer obj=new Integer(10);
         //int sum=obj.intValue()+20;//10(객체형)+20(자료형)=>기본자료형+20(기본자료형)
         int sum=obj+20;//obj.intValue()+20=30(기본자료형)
         System.out.println("sum=>"+sum);
         
         System.out.println("자동 boxing");
         //기본자료형=>자바의 객체형을 변환
         //double d=123.45;
         /*
         Double d=new Double(123.45);//Double형 객체 d생성
         printDouble(d); */
         printDouble(new Double(123.45));//익명객체형태로 전달
         printDouble(143.67);//double->new Double(143.67)
	}
	static void printDouble(Double obj2) {
	   System.out.println(obj2.toString());//소수점->문자로 변환시켜서 출력시켜주는 역할	
	}                              //"123.45"

}




