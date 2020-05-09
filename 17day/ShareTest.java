package j200211;

//동기화->입출력(RandomAccessFile)+Thread
//RandomAccessFile=>특정위치에 접근해서 정해진 파일을 생성시켜주는 클래스
import java.io.*;

public class ShareTest implements Runnable{  //extends Thread

	RandomAccessFile raf=null;//파일생성
	
	public ShareTest() {
		try {
			//1.경로포함해서 생성할 파일명 2.모드(r,rw)rw->없으면 생성, 있으면 덮어쓴다.
			raf=new RandomAccessFile("c:/webtest/3.java/result.txt","rw");
			//2.Thread객체 생성(1.Runnable객체 2.쓰레드 이름부여)
			Thread t1=new Thread(this,"lys");
			Thread t2=new Thread(this,"test");
			//3.Thread객체를 실행->start()=>run()
			t1.start(); t2.start();
		}catch(IOException e) {
			System.out.println("파일생성에 오류발생=>"+e);//e.toString()
		}
	}
	@Override
	public synchronized void run() { //throws Exception {
		// TODO Auto-generated method stub
		//raf에 글자쓰기(writeBytes())->FilePointer->글자쓸때마다 포인터 이동
		try {
			for(int i=0;i<1000;i++) {
				//쓰레드명+라인번호+파일 포인터의 갯수
				raf.writeBytes(Thread.currentThread().getName()
						              +"["+i+"]"+raf.getFilePointer()+"\n");
			}
		}catch(Exception e) {
			System.out.println("파일에 출력오류=>"+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.Runnable객체생성
		   new ShareTest();//익명객체 //ShareTest st=new ShareTest();
	}

}


