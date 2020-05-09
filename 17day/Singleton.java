package j200211;

//클래스 내부에서 특정객체를 한개만 생성->대여->반납
public class Singleton {

	//1.객체를 생성할때 한개만 생성->공유해서 사용할 수 있도록 해주기위해서 정적멤버변수로 선언
	  private static Singleton instance=null;//1.정적멤버변수로 선언
	//private static Singleton instance=new Singleton();
	//2.객체를 생성->자동으로 호출되는 메서드=>형식) private 생성자(){}
	private Singleton() { //외부에서 접근해서 객체를 생성X->나만 객체를 만들게 하기위해서
		System.out.println("인스턴스(=객체)를 생성");
	}

	//3.공유객체를 다른 모든 사람들에게 공유->정적메서드(ex 아파트 관리비)
	//형식) public static 반환시켜줄 클래스자료형 정적메서드명(){ return 공유객체명;}
	public  static Singleton getInstance() {
		//생성이 안되어있는 상태라면 하나 생성->요구하는쪽에 만들어진 객체를 빌려준다.
		if(instance==null) {
			//만들고자하는 객체를 공유객체로 등록->synchronized(클래스명.class){}
			synchronized(Singleton.class) {
				if (instance==null) {
					instance=new Singleton();
				}//if
			}
		}//outer if
		return instance;
	}
}






