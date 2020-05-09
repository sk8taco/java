package j200213;

//Thread를 이용해서 작성

public class LamTest3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);//1초
				System.out.println("출력=>"+System.currentTimeMillis());//오늘시간
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //방법1
	    LamTest3 lt=new LamTest3();
	    lt.start();
	    //방법2->익명객체를 이용해서 특정메서드를 호출
	    //형식) Thread 객체명=new Thread(){ 메서드선언 및 내용}
	    new Thread() {
	    	//오버라이딩할 메서드를 직접 구현
	    	public void run() {
	    		while(true) {
	    			try {
	    				Thread.sleep(1000);
	    				System.out.println("축약형=>"+System.currentTimeMillis());
	    			}catch(Exception e) {}
	    		}
	    	}
	    }.start();
	    //방법3->람다표현식을 사용=>익명객체(이름이 없는 객체).메서드명()
	    new Thread(()-> {
	    		while(true) {
	    			try {
	    				Thread.sleep(1000);
	    				System.out.println("람다이용=>"+System.currentTimeMillis());
	    			}catch(Exception e) {}
	    		}//while
	    	//}//run()
	    }).start();
	    //
	}
}



