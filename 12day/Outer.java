package j200204;

public class Outer {
	
	int a;//0
	public Outer() {
		a=10;//멤버변수의 기본설정값을 초기화
	}
	public void bb() {
		System.out.println("bb 호출됨!!!");
	}
	
	public void aa() {
		System.out.println("aa 호출됨!!!");
		//Outer클래스입장에서 Inner클래스의 객체를 생성->멤버변수,메서드를 호출이 가능
		//cc();
		Inner in=new Inner();
		in.cc();//객체명.메서드명(~)
	}
	//-------------Inner Class(Outer class의 멤버변수,메서드 내것처럼 사용)----------------------------
	class Inner {
	     int ax;//int ax=20;
	     public Inner() {
	    	 ax=20;
	     }
	     public void cc() {
	    	 System.out.println("내부 ax="+ax+",외부 a=>"+a);
	    	 bb();
	     }
	}
	//------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.Outer클래스의 객체생성
		Outer out=new Outer();
		//2.main()에서 Inner class에 어떻게 접근?
		//형식) Outer클래스명.Inner클래스명 inner객체명=Outer객체명.new Inner클래스명()
		Outer.Inner oi=out.new Inner();
		System.out.println("ax=>"+oi.ax);//20
		out.aa();//->Inner in=new Inner()->cc()->bb()
	}
}





