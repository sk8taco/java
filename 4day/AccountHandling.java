package j200120;

class Account{
		String name; // 계좌명의
		String no; //계좌번호
		long balance=1000; //예금잔액		
		
		// 기본기능-> 잔액조회(단순, 반복) -> 매개변수 X 반환값 X
		void searchPrint() {
			System.out.println(name+"님의 현재 잔액은"+balance+"원 입니다");
		}
		// 2. 무통장 입금 -> 입력 => 매개변수 O, 반환값 X
		void deposit(long k) {
			balance+=k;
			System.out.println(k+"원 입금이 완료되었습니다.");			
			searchPrint();
		}
		// 3.출금->입력->계산->새로고침->매개변수 O 반환값 X
		void withdraw(long k) {
			balance-=k;
			System.out.println(k+"원 출금이 완료되었습니다.");
			searchPrint();
			
		}
}

public class AccountHandling {

	public static void main(String[] args) {
		System.out.println("계좌를 여러개 만들어서 작업");
		// 철수계좌생성
		Account chulsoo = new Account();
		chulsoo.name="철수";	
		chulsoo.no="456-123-0987";
		
		// 영희계좌생성
		Account younghee = new Account();
		younghee.name="영희";
		younghee.no="333-555-0098";
		
		//철수 1000 -> 5000 입금 -> 6000 -> -4000 -> 2000
		
		chulsoo.deposit(5000); // deposit 메서드 호출 5000 매개변수 전달
		chulsoo.withdraw(4000); // witdhdraw메서드 호출  4000 매개변수 전달
	}
}
