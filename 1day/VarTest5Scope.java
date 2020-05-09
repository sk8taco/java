package j200115;
// 변수의 종류, 범위
public class VarTest5Scope {
	int su3; // 클래스 내부에 선언된 변수 : 멤버변수(전역)  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1 = 10; // 메서드 내부에서 선언된 변수 : 지역변수 (local variable)
		System.out.println("변수의 사용범위(Scope)");
		{//블럭지정
			int su2 = 20;
			System.out.println("su2:"+su2);
			System.out.println("su1:"+su1);
			
			
		}
		//System.out.println("su2:"+su2);	
		// su2는 다른 블럭에서 선언되었기 때문에 그 영역을 벗어나서는 사용할 수 없다. => 지역변수
		//
	}

}
