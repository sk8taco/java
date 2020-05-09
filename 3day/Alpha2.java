package j200117;

public class Alpha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int letter = 65;
		for(int i=1; i<=5; i++) {			
			for(int k=1; k<=i ; k++) {
				System.out.print((char)letter);
				letter++;
			}System.out.println();
		}
	}

}
