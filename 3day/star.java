package j200117;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��øfor(����for��)");
		/*
		 * for(int i=1; i<=5;i++) { for(int k=1;k<=i;k++) { // ����� ������
		 * System.out.print("*"); }System.out.println(); }
		 */
		for(int i=0; i<5; i++) {		
				for(int k=5; k>i; k--) {
					System.out.print("  ");				
				}
				for(int j=0; j<=(i*2);j++) {
					System.out.print("*");
				}System.out.println();
		}
		for(int i=5; i>=0; i--) {		
			for(int k=5; k>i; k--) {
				System.out.print("  ");				
			}
			for(int j=0; j<=(i*2);j++) {
				System.out.print("*");
			}System.out.println();
	}
		
	}
	
}
