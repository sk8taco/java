package j200213;

//�߻�Ŭ����,�������̽�=>�������
interface Xyz{//�������� ����ϰ����ϴ� �޼���,���
	int x=8;//public static final int x=8; ���ȭ
	public void a();
}

public class LamTest implements Xyz{

	public void a() {
		System.out.println("���� �Ϲ����̰� �������� ���");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //���1->�ڽ�Ŭ������ �̿��ؼ� �޼��带 ȣ��
		LamTest lt=new LamTest();
		lt.a();
		//���2->�͸�Ŭ������ �ۼ�->�߻�޼��带 �������̵��ؼ� ȣ��
		/*
		 * ����) �������̽��� ��ü��=new �ڽ�Ŭ������();
		 *         List list=new ArrayList();
		 *        �������̽��� ��ü��=new �������̽���(){
		 *           �޼��弱�� �� ����
		 *        }
		 */
		Xyz abc=new Xyz() {
			@Override
			public void a() {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ������ �̿��� �޼���ȣ����");
			}
		};
		abc.a();
	}

}



