package j200120;
//���赵 ����(Car) => �ڵ����� ����
//���� ������ �ִ� Ŭ������ �� ����(=���� ��Ű��)�� ����
public class CarHandling {

	public static void main(String[] args) {
		//1. �ڵ��� ����(=��ü ����)
		// ��ü���� -> ��ü(������ �����)�� ������ �� �ִ� ������ ������ִ� ��. (4Byte)
		//����) ���赵 �̸�(=Ŭ���� �̸�) ��ü��(=����) = new Ŭ������();
		int age; // 4byte �������� ����
		//Car morning; // ��ü ����(�������� ���� ������ �ȵ� ����
		Car morning = new Car(); // morning�� ������ ������ �ϳ� ���� -> 4byte ������
		//j200120.Car@15db9742 =>��Ű����.Ŭ������@16����
		//����̶�� : ����� ~�� ~����Ʈ ~�� ~ȣ
		System.out.println("morning�� ��="+morning);
		
		//2. ��ü��.������� = �Է��� �� => �ڵ��� ����
		morning.name ="���";
		morning.output=1000;
		morning.color="blue";
		morning.year=2020;
		
		//4. ���� -> �õ��ɱ�-> ���� �ӵ�����(�޼��� ȣ��) -> ��ü��.ȣ���� �޼����() Or (~);
		morning.startEnginee();
		morning.speedUp(150); // �Ű�����-> �޼��尡 ó���ؾ��� ����
		morning.speedDown(60 );
		System.out.println(morning.current_speed+"km");
		
		System.out.println("======================================");
		System.out.println("���̸�=>"+morning.name);
		System.out.println("����ⷮ=>"+morning.output);
		System.out.println("���� ����ӵ�=>"+morning.current_speed);
		System.out.println("======================================");
		
		morning.carInfoPrint();	// �������ó���=>�޼��� ȣ��
		
		
		
		
		
	}

}
