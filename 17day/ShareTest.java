package j200211;

//����ȭ->�����(RandomAccessFile)+Thread
//RandomAccessFile=>Ư����ġ�� �����ؼ� ������ ������ ���������ִ� Ŭ����
import java.io.*;

public class ShareTest implements Runnable{  //extends Thread

	RandomAccessFile raf=null;//���ϻ���
	
	public ShareTest() {
		try {
			//1.��������ؼ� ������ ���ϸ� 2.���(r,rw)rw->������ ����, ������ �����.
			raf=new RandomAccessFile("c:/webtest/3.java/result.txt","rw");
			//2.Thread��ü ����(1.Runnable��ü 2.������ �̸��ο�)
			Thread t1=new Thread(this,"lys");
			Thread t2=new Thread(this,"test");
			//3.Thread��ü�� ����->start()=>run()
			t1.start(); t2.start();
		}catch(IOException e) {
			System.out.println("���ϻ����� �����߻�=>"+e);//e.toString()
		}
	}
	@Override
	public synchronized void run() { //throws Exception {
		// TODO Auto-generated method stub
		//raf�� ���ھ���(writeBytes())->FilePointer->���ھ������� ������ �̵�
		try {
			for(int i=0;i<1000;i++) {
				//�������+���ι�ȣ+���� �������� ����
				raf.writeBytes(Thread.currentThread().getName()
						              +"["+i+"]"+raf.getFilePointer()+"\n");
			}
		}catch(Exception e) {
			System.out.println("���Ͽ� ��¿���=>"+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.Runnable��ü����
		   new ShareTest();//�͸�ü //ShareTest st=new ShareTest();
	}

}


