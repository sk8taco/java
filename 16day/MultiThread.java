package j200210;

//1.Thread클래스를 상속 받아서 run()구현하는 방법

public class MultiThread extends Thread{//Thread의 getName()

	//Thread이름
	public MultiThread(String s) {
		super(s);//setName(s); super("임시")
	}
	@Override
	public void run() { //실시간으로 데이터를 출력,저장,계산,,,(소문자만 출력)
		// TODO Auto-generated method stub
		//Thread의 기능
		for(char i='a';i<='z';i++) {
			try {
				Thread.sleep(500); //1000->1초동안
				System.out.println(i);
			    System.out.println("쓰레드의 이름="+this.getName());	
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.Thread객체를 생성
		/*
		MultiThread mt=new MultiThread();
		mt.setName("임시");//setName(Thread이름);
		*/
		MultiThread mt=new MultiThread("임시");
		//2.Thread가동
		mt.start();//->run()=>Thread를 가동시켜주는 역할
	}

}
