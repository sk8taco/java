package j200211;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ܺο��� ������ �Ұ�->��ü����X->������ȣ��X
         //Singleton ob1=new Singleton();
		Singleton ob1=Singleton.getInstance();
		Singleton ob2=Singleton.getInstance();
		Singleton ob3=Singleton.getInstance();
		//��ü���� �ٸ����� �ּҰ��� ����->�ϳ��� ��ü���� �ǹ�
		System.out.println("ob1=>"+ob1+",ob2=>"+ob2+",ob3->"+ob3);
		if(ob1==ob2 && ob2==ob3)
			System.out.println("ob1, ob2,ob3�� �ٰ��� ��ü�Դϴ�.");
		else
			System.out.println("ob1�� ob2�� ���� �ٸ� ��ü�Դϴ�.");
	}
}



