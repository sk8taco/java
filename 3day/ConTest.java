package j200117;

public class ConTest {

	public static void main(String[] args) {
		System.out.println("���̺��� ���� Continue��");
		A:
		for(int a=0; a<5;a++) {
			for(int b=0;b<5;b++) {
				if(b==2) 
					continue A;
				System.out.println("a="+a+",b="+b); 
			}//inner for
			System.out.println("===============");
		}//outer for
		System.out.println("���� for�� ����");
	}

}
