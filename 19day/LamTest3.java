package j200213;

//Thread�� �̿��ؼ� �ۼ�

public class LamTest3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);//1��
				System.out.println("���=>"+System.currentTimeMillis());//���ýð�
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //���1
	    LamTest3 lt=new LamTest3();
	    lt.start();
	    //���2->�͸�ü�� �̿��ؼ� Ư���޼��带 ȣ��
	    //����) Thread ��ü��=new Thread(){ �޼��弱�� �� ����}
	    new Thread() {
	    	//�������̵��� �޼��带 ���� ����
	    	public void run() {
	    		while(true) {
	    			try {
	    				Thread.sleep(1000);
	    				System.out.println("�����=>"+System.currentTimeMillis());
	    			}catch(Exception e) {}
	    		}
	    	}
	    }.start();
	    //���3->����ǥ������ ���=>�͸�ü(�̸��� ���� ��ü).�޼����()
	    new Thread(()-> {
	    		while(true) {
	    			try {
	    				Thread.sleep(1000);
	    				System.out.println("�����̿�=>"+System.currentTimeMillis());
	    			}catch(Exception e) {}
	    		}//while
	    	//}//run()
	    }).start();
	    //
	}
}



