package j200213.sub;

//추상클래스,인터페이스=>설계목적
//인터페이스에서 추상메서드가 하나만 존재할때 람다표현식을 사용할 수가있다.
interface Xyz{//공통으로 사용하고자하는 메서드,상속
	public void a(int x,int y);
	//public void b();
}

public class LamTest2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법2->익명클래스를 작성->추상메서드를 오버라이딩해서 호출
		/*
		 * 형식) 인터페이스형 객체명=new 자식클래스형();
		 *         List list=new ArrayList();
		 *        인터페이스형 객체명=new 인터페이스형(){
		 *           메서드선언 및 내용
		 *        }
		 */
		Xyz abc=new Xyz() {
			@Override
			public void a(int x,int y) {
				// TODO Auto-generated method stub
				System.out.println("익명클래스를 이용한 메서드호출방법"+(x*y));
			}
			public void b() {
				System.out.println("오버라이딩 순서가 중요하지 않다.");
			}
		};
		abc.a(6,5);//30
		//abc.b();
		/*
		 * 방법3)->인터페이스의 객체를 얻어와서 메서드를 호출할때->람다함수를 이용
		 * 형식) 인터페이스형 객체명=(매개변수,,,)->{처리할 구문}
		 * 인터페이스의 객체를 얻어올때 메서드의 반환형,메서드명을 생략할 수 있다.
		 */
		Xyz abc2=(x,y)->System.out.println("람다를 이용한다.(x+y)=>"+(x+y));
		abc2.a(6, 5);
	}

}



