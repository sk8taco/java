package j200121;

public class Member {
	int memberNo=0; 	// ȸ����ȣ - primary key
	String memberID;
	String password; // memberID�� ����
	String memberName; // ȸ���̸�
	int memberAge;
	String Address;	// ���ּ�
	String p_no1; 		// ��ȭ��ȣ 1
	String p_no2;		// ��ȭ��ȣ 2
	boolean skateExp  = false; // ������Ʈ����
	long memberPoint=0;
	
	
Member(){
	memberNo++;
}
		void searchMember(int memberNo) { //ȸ������ ��ȸ �޼ҵ�		
		System.out.println("====ȸ������=====");
		System.out.println("ȸ����ȣ ="+memberNo);
		System.out.println("ȸ��ID ="+memberID);
		System.out.println("ȸ���̸� ="+memberName);
		System.out.println("ȸ������ ="+memberAge);
		System.out.println("ȸ���ּ�="+Address);
		System.out.println("ȸ����ȭ��ȣ1="+p_no1);
		System.out.println("ȸ����ȭ��ȣ2 ="+p_no2);
		String Exp;
		if(skateExp) {
			Exp = "��";
		}else {
			Exp ="��";
		}
		System.out.println("������Ʈ ���� ��/��="+Exp);
		System.out.println("ȸ�� ����Ʈ="+memberPoint);
	}
	void pointUp(long point) {
		memberPoint+=point;
		System.out.println("���� �������� ����Ʈ�� �����Ǿ����ϴ�.");
		System.out.println("���� ����Ʈ�� "+memberPoint+"�Դϴ�");
	}
	void pointDown(long point) {
		memberPoint-=point;
		System.out.println("���� ���������� ����Ʈ�� �𿴽��ϴ�.");
		System.out.println("���� ����Ʈ�� "+memberPoint+"�Դϴ�");
	}	
}
