package j200213.sub;

//�߻�Ŭ����,�������̽�=>�������
//�������̽����� �߻�޼��尡 �ϳ��� �����Ҷ� ����ǥ������ ����� �����ִ�.
interface Xyz{//�������� ����ϰ����ϴ� �޼���,���
	public void a(int x,int y);
	//public void b();
}

public class LamTest2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			public void a(int x,int y) {
				// TODO Auto-generated method stub
				System.out.println("�͸�Ŭ������ �̿��� �޼���ȣ����"+(x*y));
			}
			public void b() {
				System.out.println("�������̵� ������ �߿����� �ʴ�.");
			}
		};
		abc.a(6,5);//30
		//abc.b();
		/*
		 * ���3)->�������̽��� ��ü�� ���ͼ� �޼��带 ȣ���Ҷ�->�����Լ��� �̿�
		 * ����) �������̽��� ��ü��=(�Ű�����,,,)->{ó���� ����}
		 * �������̽��� ��ü�� ���ö� �޼����� ��ȯ��,�޼������ ������ �� �ִ�.
		 */
		Xyz abc2=(x,y)->System.out.println("���ٸ� �̿��Ѵ�.(x+y)=>"+(x+y));
		abc2.a(6, 5);
	}

}



