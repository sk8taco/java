package j200210;

//2.Runnable �������̽��� ��ӹ޾Ƽ� �ۼ��ϴ� ���=>���������� Thread�� ��ӹ޾Ƽ� �ۼ��� �� ������

public class MyThread  implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("is Running!");
			try {
				Thread.sleep(1000);//1��
				System.out.println(Thread.currentThread().getName());//Thread�̸�
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread my=new MyThread();//1.Runnable��ü����
       //1.Runnable��ü�� 2.�������̸��� �ο�
       Thread t=new Thread(my,"�׽�Ʈ");//2.Thread��ü�����ϸ鼭 �������� �μ��� Runnable��ü����
       t.start();//->run()->������ main������� ������ �Ǹ鼭 �ٸ� �����带 ����
       //t.run();//=>�ü������ ȣ�����ִ� �޼���(���������� ȣ��X)->callback�޼���
       //������ main������� ������¿��� �ٸ� �����带 ����->���ɿ� ������ ��ģ��.(���ۿ���)
       System.out.println("Main Thread Terminated!");
	}

}



