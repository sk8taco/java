package j200210.super2;
/*
 * �޼����� �Ű������ν� ���޹����� ��밡���� ���ʸ�
 * 4)<? super T> =>T(�ڽ�Ŭ����)�� �������� �������ְ� �� �ڽ�Ŭ������ ������ �ִ� �θ�Ŭ����
 *                           �� ������ �� ������ �ȴ�.(�Ű������� ����)
 */

import java.util.*;

class Test{
	String name;
}
//class Person extends Test{ //�θ�Ŭ���� T =>Person�� �θ��� Test
class Person {
	String name;
	Person(){}//=>�ּҰ��� ���
	//�߰�
	Person(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
//Man
class Man extends Person{ //T(Man)->�ڽ�Ŭ����
	//String name;
	Man(String name){
		this.name=name;//?.name="�ӽ�";
	}
	//public String getName() { return name;}
	@Override
	public String toString() {  //Men m=new Men("�ӽ�");
		// TODO Auto-generated method stub
		return name;
	}
}

//Woman
class Woman extends Person{ //T(�ڽ�Ŭ����)
	//String name;
	Woman(String name){
		this.name=name;
	}
	@Override
	public String toString() {  
		// TODO Auto-generated method stub
		return name;
	}
}

public class WildSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Man
		List<Man> list=new ArrayList<Man>();
		list.add(new Man("�ӽ�"));
		list.add(new Man("�׽�Ʈ"));
		printData(list);
		
		//Woman
		List<Woman> list2=new ArrayList<Woman>();
		//Man m=new Man("�ӽ�");
		list2.add(new Woman("������"));
		list2.add(new Woman("�Ż��Ӵ�"));
		printData(list2);
		
		//Person
		List<Person> list3=new ArrayList<Person>();
		list3.add(new Person("�����"));
		list3.add(new Person("�̻��"));
		printData(list3);
		
		//
		List<Double> list4=new ArrayList<Double>();
		list4.add(12.6); list4.add(45.6); list4.add(78.9);
		printData(list4);
		
	}
	public static void printData(List<?> list) {  //��� Ŭ���� �� ����(��Ӱ� �������)
	//public static void printData(List<? super Person> list) { //Person�� (O),Person�� �θ�	
	//public static void printData(List<? super Man> list) {//Man,Man�� �θ� Person	  
	//public static void printData(List<? super Woman> list) {//Woman,Person	
		for(Object obj:list)
			System.out.println(obj);//obj.toString();//���ڷ� ���
	}
    //~printData2(List<Woman>list2){~}
	//~printData3(List<Person>list3){~}
}




