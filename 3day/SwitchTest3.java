package j200117;

public class SwitchTest3 {
	public static void main(String[] args) {
		System.out.println("���ǽĿ����� ���� ����� ����");
		String day="10";
			
		switch(day) {
		
		case "10":
			System.out.println("10�� ������");
			break;
			
		case "20": case "30": case "40": case "50": case "60":
			System.out.println("������ ���ڿ��� 20~60 ������ �ֽ��ϴ�");
		}
		System.out.println("switch ����");
	}
}
