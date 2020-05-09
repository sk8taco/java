package j200211;

//�޿�����(����������)->ATM(Thread �۵�)
class ATM implements Runnable{
	
	//�޿����� �ݾ�
	private long money=10000;
	
	@Override
	public void run() { //������->�ڵ���ü,�����,��������
		// TODO Auto-generated method stub
		//����) synchronized(������ ������){ó���ؾ��� ����;}//DB
		synchronized(this) { //atm(�ڱ� Ŭ������ü���� X)
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);//1�ʵ��� ����ڿ� ����
				}catch(Exception e) {}
				if(getMoney()<=0)
					break;//0�� �ܾ��� ���⿡
				withDraw(2000);
			}
		}//syn~
	}
	//���� ��������ִ� �޼���->��������->�Ű����� O, ��ȯ�� X
	public void withDraw(long howmuch) {
		//����� ��츸 ���� ����
		if(getMoney()>0) {//if(money>0) {
			money-=howmuch;//money=money-howmuch;
			System.out.println(Thread.currentThread().getName()+","+getMoney());
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	//�ܾ��� ��ȸ=>����� �����͸� ������ ���=>��ȯ���� ����,�Ű����� X
	public long getMoney() {
		return this.money;
	}
}
public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ATM atm=new ATM();
         Thread t1=new Thread(atm,"�����");//runnable��ü��,Thread��
         Thread t2=new Thread(atm,"������");
         t1.start(); t2.start();//->run()->withDraw()
	}

}



