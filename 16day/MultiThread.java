package j200210;

//1.ThreadŬ������ ��� �޾Ƽ� run()�����ϴ� ���

public class MultiThread extends Thread{//Thread�� getName()

	//Thread�̸�
	public MultiThread(String s) {
		super(s);//setName(s); super("�ӽ�")
	}
	@Override
	public void run() { //�ǽð����� �����͸� ���,����,���,,,(�ҹ��ڸ� ���)
		// TODO Auto-generated method stub
		//Thread�� ���
		for(char i='a';i<='z';i++) {
			try {
				Thread.sleep(500); //1000->1�ʵ���
				System.out.println(i);
			    System.out.println("�������� �̸�="+this.getName());	
			}catch(Exception e) {e.printStackTrace();}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.Thread��ü�� ����
		/*
		MultiThread mt=new MultiThread();
		mt.setName("�ӽ�");//setName(Thread�̸�);
		*/
		MultiThread mt=new MultiThread("�ӽ�");
		//2.Thread����
		mt.start();//->run()=>Thread�� ���������ִ� ����
	}

}
