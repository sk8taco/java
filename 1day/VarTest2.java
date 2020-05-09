package j200115;
//실수
public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실수값을 저장");
		float f=5.3f;	//float형으로 소수점을 저장한다는 표시
		double f2=5.3;	//자료형이 달라도 같은 변수명을 사용할 수 없다.
		System.out.println("f=>"+f+",f2=>"+f2);
		
		System.out.println("float,double의 차이점");
		float m_float=123456.789123f;	// 소수점 둘째 자리까지 저장
		double m_double =123456.789123; // 정밀한 값을 저장 > double형을 사용하라
		
		System.out.println("m_float=>"+m_float+",m_double=>"+m_double);
	}

}
