package j200115;
// ������ ����, ����
public class VarTest5Scope {
	int su3; // Ŭ���� ���ο� ����� ���� : �������(����)  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1 = 10; // �޼��� ���ο��� ����� ���� : �������� (local variable)
		System.out.println("������ ������(Scope)");
		{//������
			int su2 = 20;
			System.out.println("su2:"+su2);
			System.out.println("su1:"+su1);
			
			
		}
		//System.out.println("su2:"+su2);	
		// su2�� �ٸ� ������ ����Ǿ��� ������ �� ������ ������� ����� �� ����. => ��������
		//
	}

}
