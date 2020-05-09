package j200213;

//추상클래스,인터페이스=>설계목적
interface Xyz{//공통으로 사용하고자하는 메서드,상속
	int x=8;//public static final int x=8; 상수화
	public void a();
}

public class LamTest implements Xyz{

	public void a() {
		System.out.println("가장 일반적이고 대중적인 방법");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //방법1->자식클래스를 이용해서 메서드를 호출
		LamTest lt=new LamTest();
		lt.a();
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
			public void a() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스를 이용한 메서드호출방법");
			}
		};
		abc.a();
	}

}



