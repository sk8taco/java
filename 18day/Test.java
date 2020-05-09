package j200212;

import java.util.Scanner;

//import j200211.Singleton;

//Ŭ���� ���ο��� Ư����ü�� �Ѱ��� ����->�뿩->�ݳ�
public class Test {

	 private static Scanner instance=null;
	//private static Scanner instance=new Scanner(System.in);
	//2.��ü�� ����->�ڵ����� ȣ��Ǵ� �޼���=>����) private ������(){}
	private Test() { //�ܺο��� �����ؼ� ��ü�� ����X->���� ��ü�� ����� �ϱ����ؼ�
		System.out.println("�ν��Ͻ�(=��ü)�� ����");
	}

	//3.������ü�� �ٸ� ��� ����鿡�� ����->�����޼���(ex ����Ʈ ������)
	//����) public static ��ȯ������ Ŭ�����ڷ��� �����޼����(){ return ������ü��;}
	public  static Scanner getInstance() {
		//������ �ȵǾ��ִ� ���¶�� �ϳ� ����->�䱸�ϴ��ʿ� ������� ��ü�� �����ش�.
		if(instance==null) {
			//��������ϴ� ��ü�� ������ü�� ���->synchronized(Ŭ������.class){}
			synchronized(Test.class) {
				if (instance==null) {
					instance=new Scanner(System.in);
				}//if
			}
		}//outer if
		return instance;
	}
}






