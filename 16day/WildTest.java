package j200210;
//2.<?> ���ϵ� ī�带 �̿��� ���ʸ� ���=>�޼��� ȣ��� �Ű��������� ����
import java.util.*;//List
public class WildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�������̽� ��ü=new �������̽�(X) ->new �ڽ�Ŭ������
		//List list=new List();(X)=>List list=new ArrayList();(O)
		//ArrayList<String> list=new ArrayList<String>();
		//1.���ڿ�
		List<String> list=new ArrayList<String>();
		list.add("�׽�Ʈ1"); list.add("�׽�Ʈ2"); list.add("�׽�Ʈ3");
		printData(list);
		
		//2.������
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(100); list2.add(200); list2.add(new Integer(300));
		printData(list2);
		
		//3.�Ҽ�������
		List<Double> list3=new ArrayList();
		list3.add(12.5); list3.add(45.6); list3.add(78.9);
		printData(list3);
	}
	
	//��°��� ó�����ִ� �Ϲ�Ŭ������ �Ϲݸ޼���-><?>�Ű������� ���޹����� �ڷ����� �׶��׶� ���� �ٲ�� �ִ�.
	public static void printData(List<?> list) {//��ü�ڵ� ����ȯ
		for(Object obj:list)
			System.out.println(obj);//obj.toString()->���ڷ� ��ȯ�ż� ���
	}
	/*
	public static void printData2(List<Integer> list) {
		for(Integer obj:list)
			System.out.println(obj);//obj.toString()->�������
	}
	
	public static void printData3(List<Double> list) {
		for(Double obj:list)
			System.out.println(obj);//obj.toString()->�������
	}
   */
}
