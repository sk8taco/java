package j200117;
//��øfor��
public class ForTest2 {
	public static void main(String[] args) {
		System.out.println("��øfor(����for��)");
		//			1)	 2)
		for(int a=0; a<5;a++) {
			//System.out.println("a="+a);
			//		3)		4)	 7)	10)		6)9)	
			for(int b=0;b<5;b++) {
				System.out.println("a="+a+",b="+b); //5)8)
			}//inner for
			System.out.println("===============");
		}//outer for
		System.out.println("���� for�� ����");
	}
}
