package j200117;

public class SumBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		
		for(; i<=100; i++) {
			if((i%3==0)||(i%5==0)) {
				System.out.print(i+"  ");
				sum+=i;
				if(sum>=200) {
					break;
				}
			}			
		}System.out.println("ÃÖÁ¾ sum=>"+sum);
	}

}
