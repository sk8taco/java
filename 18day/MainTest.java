package j200212;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ܺο��� ������ �Ұ�->��ü����X->������ȣ��X
         //Test t=new Test();//��ü����X
		Scanner ob1=Test.getInstance();//->���� Scanner��ü�� �����ϴ� ����
		Scanner ob2=Test.getInstance();
		Scanner ob3=Test.getInstance();
		//��ü���� �ٸ����� �ּҰ��� ����->�ϳ��� ��ü���� �ǹ�
		System.out.println("ob1=>"+ob1+",ob2=>"+ob2+",ob3->"+ob3);
		if(ob1==ob2 && ob2==ob3)
			System.out.println("ob1, ob2,ob3�� �ٰ��� ��ü�Դϴ�.");
		else
			System.out.println("ob1�� ob2�� ���� �ٸ� ��ü�Դϴ�.");
	}
}



