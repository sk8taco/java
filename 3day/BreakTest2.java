package j200117;

public class BreakTest2 {

	public static void main(String[] args) {
		System.out.println("���̺��� �ִ� �극��ũ��");
		A://����) ���̺��:
		for(int a=0; a<5;a++) {
			for(int b=0;b<5;b++) {
				if(b==2) 
					break A;//����)���ǽĿ� �´� ���� break ���̺��;
								// �ش� �ݺ����� �������� A ����Ʈ�� ����
								//�ݺ����� �ǳʶپ� ���� �ڵ带 �����Ѵ�.
				System.out.println("a="+a+",b="+b); 
			}//inner for
			System.out.println("===============");
		}//outer for
		System.out.println("���� for�� ����");
	}

}
