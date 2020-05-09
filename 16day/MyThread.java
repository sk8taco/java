package j200210;

//2.Runnable 인터페이스를 상속받아서 작성하는 경우=>직접적으로 Thread을 상속받아서 작성할 수 없을때

public class MyThread  implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("is Running!");
			try {
				Thread.sleep(1000);//1초
				System.out.println(Thread.currentThread().getName());//Thread이름
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread my=new MyThread();//1.Runnable객체생성
       //1.Runnable객체명 2.쓰레드이름을 부여
       Thread t=new Thread(my,"테스트");//2.Thread객체생성하면서 생성자의 인수에 Runnable객체대입
       t.start();//->run()->기존의 main쓰레드는 유지가 되면서 다른 쓰레드를 가동
       //t.run();//=>운영체제에서 호출해주는 메서드(직접적으로 호출X)->callback메서드
       //기존의 main쓰레드는 멈춘상태에서 다른 쓰레드를 가동->성능에 영향을 미친다.(나쁜영향)
       System.out.println("Main Thread Terminated!");
	}

}



