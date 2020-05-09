package j200210;

//멀티쓰레드->한개이상의 쓰레드를 가동시키는 방법
import java.io.*;
//입출력->BufferedReader를 이용

public class MultiThread2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("실행시킬 단을 입력?");
		BufferedReader br=new BufferedReader
				             (new InputStreamReader(System.in));
		
		int dan=Integer.parseInt(br.readLine());
		GooGoo go=new GooGoo(dan);
        //1.Runnable객체 생성
		//GooGoo go=new GooGoo(5);
		//2.Thread객체생성->생성자의 매개변수로 Runnable객체 go전달
		Thread t=new Thread(go);
		//3.start()->run()호출
		PrintThread pt=new PrintThread();
		//한개이상의 쓰레드를 실행->서로 경쟁적으로 실행(둘의 실행결과가 서로 섞여서 나옴)
		//우선순위를 지정해줄 수 있다.
		t.setPriority(10);//Thread.MAX_PRIORITY
		pt.setPriority(Thread.MIN_PRIORITY);//1
		
		t.start(); pt.start();
	}
}
//2.구구단을 출력=>Runnable
class GooGoo implements Runnable{
	
	private int dan;//단을 저장
	
	public GooGoo(int dan) {
		this.dan=dan;//go.dan=5
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {//5(dan)*1=5~5*9=45
			try {
				Thread.sleep(700);
				System.out.println(dan+"단:"+dan+"*"+i+"="+(dan*i));
			}catch(Exception e) {System.out.println(e);}//e.toString()
		}
	}
}
//1.임의의 숫자를 속도조절하면서 출력
class PrintThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			try {
				//난수발생(=임의의 숫자를 생성하는 방법)(0~0.999999999)
				long sleeptime=(int)(Math.random()*500+1); //Math.random()*100+1
				System.out.println("sleeptime=>"+sleeptime);
				Thread.sleep(sleeptime);
				System.out.println("i="+i);
			}catch(Exception e) {}
		}//for
	}
}



