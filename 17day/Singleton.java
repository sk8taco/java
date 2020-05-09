package j200211;

//Ŭ���� ���ο��� Ư����ü�� �Ѱ��� ����->�뿩->�ݳ�
public class Singleton {

	//1.��ü�� �����Ҷ� �Ѱ��� ����->�����ؼ� ����� �� �ֵ��� ���ֱ����ؼ� ������������� ����
	  private static Singleton instance=null;//1.������������� ����
	//private static Singleton instance=new Singleton();
	//2.��ü�� ����->�ڵ����� ȣ��Ǵ� �޼���=>����) private ������(){}
	private Singleton() { //�ܺο��� �����ؼ� ��ü�� ����X->���� ��ü�� ����� �ϱ����ؼ�
		System.out.println("�ν��Ͻ�(=��ü)�� ����");
	}

	//3.������ü�� �ٸ� ��� ����鿡�� ����->�����޼���(ex ����Ʈ ������)
	//����) public static ��ȯ������ Ŭ�����ڷ��� �����޼����(){ return ������ü��;}
	public  static Singleton getInstance() {
		//������ �ȵǾ��ִ� ���¶�� �ϳ� ����->�䱸�ϴ��ʿ� ������� ��ü�� �����ش�.
		if(instance==null) {
			//��������ϴ� ��ü�� ������ü�� ���->synchronized(Ŭ������.class){}
			synchronized(Singleton.class) {
				if (instance==null) {
					instance=new Singleton();
				}//if
			}
		}//outer if
		return instance;
	}
}






