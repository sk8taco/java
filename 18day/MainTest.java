package j200212;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부에서 접근이 불가->객체생성X->생성자호출X
         //Test t=new Test();//객체생성X
		Scanner ob1=Test.getInstance();//->내부 Scanner객체를 생성하는 구문
		Scanner ob2=Test.getInstance();
		Scanner ob3=Test.getInstance();
		//객체명은 다르지만 주소값은 같다->하나의 객체임을 의미
		System.out.println("ob1=>"+ob1+",ob2=>"+ob2+",ob3->"+ob3);
		if(ob1==ob2 && ob2==ob3)
			System.out.println("ob1, ob2,ob3은 다같은 객체입니다.");
		else
			System.out.println("ob1과 ob2은 서로 다른 객체입니다.");
	}
}



