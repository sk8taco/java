package j200210;

public class GenericEx<T> {  //배열의 값을 저장->출력목적=>GenericExMain.java

	//자료형만 다를뿐이고 배열의 값을 저장할 목적으로 선언된 멤버변수
	/* 제너릭클래스=>특정 자료형의 값만 입력을 받아서 저장,조회,계산,출력이 가능
	 * 형식)  class 클래스명<T>
	 *         멤버변수,메서드의 매개변수에도 제너릭을 부여할 수  가 있다.
	 * 
	 */
	  T v[];//String v[]; Double v2[]; Integer v3[];
	
	//1.배열에 값을 저장시킬 목적 메서드->Setter(매개변수 O, 반환값X)
	public void set(T n[]) { //String,Double,Integer,,,
		v=n;//this.v=v;
	}
	/*
	public void set(Double n[]) { //오버로딩->같은 메서드인데 서로 다르게 인식시키는 방법
		v2=n;//this.v=v;
	}
	public void set(Integer n[]) { 
		v3=n;//this.v=v;
	}*/
	
	//2.배열의 값을 꺼내와서 화면에 출력(단순,반복)=>멤버변수자료형 getXXx() or 출력목적
	public void print() {
		for(T s:v)//for(String s:v)
			System.out.println(s);
	}
}
