package j200207;
//1.Map�� ���� �Ͱ� �˻��ϴ� ���(=>select)
import java.util.*;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector();
		v.add("test1"); v.add("test2"); v.add("test3");//elementAt(�ε�����ȣ)
		System.out.println("�ؽ����̺�(Map)");//Ű�� �����Ұ��� �����ؼ� ����
		//����)<key�� �ڷ���,key�� �����ϴ� ���� �ڷ���>
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		//hashtable��ü��.put(Ű��,�����Ұ�)<->hashtable��ü��.get(Ű��)
		h.put(1,"ȫ�浿");h.put(2,"����� ������");h.put(3,"010-123-0987");
		String tel=h.get(3);
		System.out.println("tel=>"+tel);
		//�÷����� ������ �ٸ��� ������ �������� �˻��ϴ� ���=>Enumeration,Iterator
		//�������̽��� ��ü�� ���� �� �ִ�.
		//Enumeration<String> eu=new Enumeration<String>();
		Enumeration<String> eu=v.elements();//�޼����� ��ȯ��
		while(eu.hasMoreElements()) {//�˻��� �����Ͱ� �� �ִٸ�
			System.out.println(eu.nextElement());//�ϳ��� �����Ͷ�
		}
		//2.Iterator->�������� å���̿� �� �ִ� å���� ����=>å�� �����ö��� ������������������
		Collection<String> c=h.values();//1.Collection��ü�� ���´�
		Iterator<String> ih=c.iterator();
		//hasNext()->�˻��� �����Ͱ� �ִ��� üũ, next()=>ã�� �����Ͱ� ������ �ϳ��� �����´�.
		while(ih.hasNext()==true) {
			System.out.println(ih.next());//�ϳ��� �����´�.
		}
	}

}




