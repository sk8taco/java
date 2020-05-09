package j200210;

//��Ƽ������->�Ѱ��̻��� �����带 ������Ű�� ���
import java.io.*;
//�����->BufferedReader�� �̿�

public class MultiThread2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("�����ų ���� �Է�?");
		BufferedReader br=new BufferedReader
				             (new InputStreamReader(System.in));
		
		int dan=Integer.parseInt(br.readLine());
		GooGoo go=new GooGoo(dan);
        //1.Runnable��ü ����
		//GooGoo go=new GooGoo(5);
		//2.Thread��ü����->�������� �Ű������� Runnable��ü go����
		Thread t=new Thread(go);
		//3.start()->run()ȣ��
		PrintThread pt=new PrintThread();
		//�Ѱ��̻��� �����带 ����->���� ���������� ����(���� �������� ���� ������ ����)
		//�켱������ �������� �� �ִ�.
		t.setPriority(10);//Thread.MAX_PRIORITY
		pt.setPriority(Thread.MIN_PRIORITY);//1
		
		t.start(); pt.start();
	}
}
//2.�������� ���=>Runnable
class GooGoo implements Runnable{
	
	private int dan;//���� ����
	
	public GooGoo(int dan) {
		this.dan=dan;//go.dan=5
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {//5(dan)*1=5~5*9=45
			try {
				Thread.sleep(700);
				System.out.println(dan+"��:"+dan+"*"+i+"="+(dan*i));
			}catch(Exception e) {System.out.println(e);}//e.toString()
		}
	}
}
//1.������ ���ڸ� �ӵ������ϸ鼭 ���
class PrintThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			try {
				//�����߻�(=������ ���ڸ� �����ϴ� ���)(0~0.999999999)
				long sleeptime=(int)(Math.random()*500+1); //Math.random()*100+1
				System.out.println("sleeptime=>"+sleeptime);
				Thread.sleep(sleeptime);
				System.out.println("i="+i);
			}catch(Exception e) {}
		}//for
	}
}



