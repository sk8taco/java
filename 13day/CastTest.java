package j200205;
/*
 * ��ü����ȯ(�ڵ�,�������(=����)����ȯ)
 * �� �������� ������ �������� �ٸ��� ������ ���� ���� �޼��带 �ۼ��ؾ� �ȴ�(���� ����)
 */
class Employee{//����(����,����,�����Ͼ�,,,)500��(�μ����� ������ �ٸ���)
	public void taxRate(Employee e) {
		
		if(e instanceof Manager) {//man.taxRate(man);
			//���������� �ڽĿ� �°� �ڽ������� ����ȯ���Ѽ� ���
			Manager m=(Manager)e;// (�ڽ�Ŭ������)�θ�ü��
			System.out.println("Manager�� �´� ���ݱ��ϱ�");
		}else if(e instanceof Engineer) {
			Engineer en=(Engineer)e;
			System.out.println("Engineer�� �´� ���ݱ��ϱ�");
		}else if(e instanceof Employee) {
			System.out.println("Employee�� �´� ���ݱ��ϱ�");
		}
	}
	//public void taxRate2(Manager e) {}
	//public void taxRate3(Engineer e) {}
	//�������� �������� �� �ٸ��⿡ ������ ���� ���� ������ ����=>�ߺ��� �ڵ��� �ݺ������� ���(����)
	//��Ӱ���->���� �ֻ��� �θ�Ŭ���������� ����ȯ�� ����->�޼��� �Ѱ�
}
//����=>������ ���+������ ���
class Manager extends Employee{
	//public void taxRate(Manager e) {} =>�̷��� �޼��� �ۼ��� �ʿ����.
}
//�����Ͼ�=>������ ���+�����Ͼ� ���
class Engineer extends Employee{
	//public void taxRate(Engineer e) {}
}

public class CastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp=new Employee();
        Manager man=new Manager();
        Engineer eng=new Engineer();
        //������->�޼��带 �ٸ��� �ۼ�(taxRate())
        emp.taxRate(emp);
        man.taxRate(man);//Manager->Employee(��ü �ڵ�����ȯ)
        eng.taxRate(eng);//Engineer->Employee
	}

}





