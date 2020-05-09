package j200212;

import java.util.Scanner;

//import j200211.Singleton;

//클래스 내부에서 특정객체를 한개만 생성->대여->반납
public class Test {

	 private static Scanner instance=null;
	//private static Scanner instance=new Scanner(System.in);
	//2.객체를 생성->자동으로 호출되는 메서드=>형식) private 생성자(){}
	private Test() { //외부에서 접근해서 객체를 생성X->나만 객체를 만들게 하기위해서
		System.out.println("인스턴스(=객체)를 생성");
	}

	//3.공유객체를 다른 모든 사람들에게 공유->정적메서드(ex 아파트 관리비)
	//형식) public static 반환시켜줄 클래스자료형 정적메서드명(){ return 공유객체명;}
	public  static Scanner getInstance() {
		//생성이 안되어있는 상태라면 하나 생성->요구하는쪽에 만들어진 객체를 빌려준다.
		if(instance==null) {
			//만들고자하는 객체를 공유객체로 등록->synchronized(클래스명.class){}
			synchronized(Test.class) {
				if (instance==null) {
					instance=new Scanner(System.in);
				}//if
			}
		}//outer if
		return instance;
	}
}






