package j200210;

public class ThreadTest {

	//내부적으로 메인메서드를 실행시켜주는 역할=>메인쓰레드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Thread의 이름->getName()<->setName(쓰레드이름),고유의 id->getId()
		//Thread.currentThread()=>현재 작동중인 쓰레드객체를 가리킨다.
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getId());//1
		while(true) { //무한루프도 쓰레드의 한 종류
			System.out.println("main Thread실행중!!!");
		}
	}

}
