package j200120;

//�߻�ȭ -> ���ο� �ڷ����� ����� 
public class Car {
		//����Ư�� -> �⺻�ڷ��� 8������ �̿� (�������: Ŭ���� ���ο� ����� ����)
		String name; 
		int output;	//��ⷮ
		int year; //���
		String color; //���� ����
		//���� ����
		int current_speed; // ���� �ӵ�
		//	int -> 1,0
		boolean sidong = false;
		
		//1. ���� �õ��ɱ� -> �ܼ��ϰ� �ݺ����� �� (�Ű�����X,��ȯ��X)
		void startEnginee(){
			sidong = true;
			System.out.println("�õ��� �ɸ�!"+sidong);
			}
		
		//2.���� �ӵ�����
		void speedUp(int speed) { // �Ű����� O  ��ȯ�� X -> �ӵ��� �Է¹޾Ƽ� ���������� ���, ����
			current_speed+=speed;
			System.out.println(speed+"km��ŭ �ӵ��� �����Ǿ����ϴ�.");
		}
		
		//3.���� �ӵ�����
		void speedDown(int speed) {
			current_speed-=speed;
			System.out.println(speed+"km��ŭ �ӵ��� ���ҵǾ����ϴ�.");
		}
		//4.���� ���� ���
		void carInfoPrint() { // �Ű���� X ��ȯ�� X
			System.out.println("===���� ����===");
			System.out.println("���� �̸���="+name);			
			System.out.println("���� ��ⷮ="+output+"cc");
			System.out.println("���� ����="+color);			
			System.out.println("���� �ӵ�="+current_speed);
			System.out.println("���� �õ�����="+sidong);
		}
		//5. ����
		void stop() {
			sidong=false;
			current_speed=0;
			System.out.println("���������� ������ �Ϸ�Ǿ����ϴ�.");
		}
}
