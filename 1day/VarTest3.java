package j200115;

public class VarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ��");
		boolean b=true;
		boolean b2=2>3;
		System.out.println("b=>"+b+",b2=>"+b2);
		System.out.println("������(char,String)");
		char c1 = 'A'; // ASCI �ڵ尪 : 65
		char c2 = 65; // int c2= 65; -> ����65 char c2 =65 -> �ƽ�Ű�ڵ尪
		//16���� ���·� �Է��� �޾Ƽ� ���ڸ� ����? '\u0000' ~ '\uffff' -> �������·� 16����
		
		char c3 = '\u0041'; // 16�������·� ���ڸ� ����
		/*
		 * ����(2,8,10,16 ����)�� �����ϴ� ���
		 * 45(10����) 045(8������ ����) 0X45(16����) 
		 */
		System.out.println("c1:"+c1+",c2:"+c2+"c3:"+c3);
		// ���ڿ� -> ����+����  -> 'a' + 'b' => "ab"
		// ���ڿ� -> ���ڿ� + ���ڿ� => "ab"+"cd" => "abcd"
		String s1 = "�ĺ��� �ڹٱ��� ����";
		String s2 = "����,�ڷ���,������";
		String s3 = s1+" "+s2;
		System.out.println("s3:"+s3);
	}

}
