package j200120;

class Account{
		String name; // ���¸���
		String no; //���¹�ȣ
		long balance=1000; //�����ܾ�		
		
		// �⺻���-> �ܾ���ȸ(�ܼ�, �ݺ�) -> �Ű����� X ��ȯ�� X
		void searchPrint() {
			System.out.println(name+"���� ���� �ܾ���"+balance+"�� �Դϴ�");
		}
		// 2. ������ �Ա� -> �Է� => �Ű����� O, ��ȯ�� X
		void deposit(long k) {
			balance+=k;
			System.out.println(k+"�� �Ա��� �Ϸ�Ǿ����ϴ�.");			
			searchPrint();
		}
		// 3.���->�Է�->���->���ΰ�ħ->�Ű����� O ��ȯ�� X
		void withdraw(long k) {
			balance-=k;
			System.out.println(k+"�� ����� �Ϸ�Ǿ����ϴ�.");
			searchPrint();
			
		}
}

public class AccountHandling {

	public static void main(String[] args) {
		System.out.println("���¸� ������ ���� �۾�");
		// ö�����»���
		Account chulsoo = new Account();
		chulsoo.name="ö��";	
		chulsoo.no="456-123-0987";
		
		// ������»���
		Account younghee = new Account();
		younghee.name="����";
		younghee.no="333-555-0098";
		
		//ö�� 1000 -> 5000 �Ա� -> 6000 -> -4000 -> 2000
		
		chulsoo.deposit(5000); // deposit �޼��� ȣ�� 5000 �Ű����� ����
		chulsoo.withdraw(4000); // witdhdraw�޼��� ȣ��  4000 �Ű����� ����
	}
}
