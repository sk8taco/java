package j200210;

public class ThreadTest {

	//���������� ���θ޼��带 ��������ִ� ����=>���ξ�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Thread�� �̸�->getName()<->setName(�������̸�),������ id->getId()
		//Thread.currentThread()=>���� �۵����� �����尴ü�� ����Ų��.
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getId());//1
		while(true) { //���ѷ����� �������� �� ����
			System.out.println("main Thread������!!!");
		}
	}

}
