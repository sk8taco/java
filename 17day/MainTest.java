package j200211;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부에서 접근이 불가->객체생성X->생성자호출X
         //Singleton ob1=new Singleton();
		Singleton ob1=Singleton.getInstance();
		Singleton ob2=Singleton.getInstance();
		Singleton ob3=Singleton.getInstance();
		//객체명은 다르지만 주소값은 같다->하나의 객체임을 의미
		System.out.println("ob1=>"+ob1+",ob2=>"+ob2+",ob3->"+ob3);
		if(ob1==ob2 && ob2==ob3)
			System.out.println("ob1, ob2,ob3은 다같은 객체입니다.");
		else
			System.out.println("ob1과 ob2은 서로 다른 객체입니다.");
	}
}



