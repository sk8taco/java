package j200117;

public class Star3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=5; j++) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}			
			}System.out.println();
		}
		
		
		/*
		 * for(int i=1; i<=5; i++) { for(int j=1;i>j; j++) { System.out.print("  "); }
		 * for(int k=5;i<=k; k--) { System.out.print("*"); } System.out.println(); }
		 */
	}
}
