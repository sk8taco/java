package j200210;
/*
 * �޼����� �Ű������ν� ���޹����� ��밡���� ���ʸ�
 * 3)<? extends T>=>��Ӱ���� �̷���� Ŭ������ �ڷ������� �ްڴٴ� ǥ��
 *    ? (�ڽ�Ŭ����(Man,Woman), T(�θ�Ŭ������ Person)
 *    �θ�Ŭ���� �Ӹ��ƴ϶� �ڽ�Ŭ������ ������ �ڷ����� �޼����� �Ű������� �޾Ƽ� ó�����ְڴٴ� ǥ��
 */

import java.util.*;

class Test{     //�θ�Ŭ���� T
	String name;
}

class Person{ //�θ�Ŭ���� T
	String name;
	//Person(){}=>�ּҰ��� ���
}
//Man
class Man extends Person{
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
class Woman extends Person{
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

public class WildExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Man
		List<Man> list=new ArrayList<Man>();
		//Man m=new Man("�ӽ�");
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
		list3.add(new Person());
		printData(list3);
		//Test
		List<Test> list4=new ArrayList<Test>();
		list4.add(new Test());
		//printData(list4);
		
	}
	//public static void printData(List<?> list) {  //��� Ŭ���� �� ����
	public static void printData(List<? extends Person> list) {	
		for(Object obj:list)
			System.out.println(obj);//obj.toString();//���ڷ� ���
	}
    //~printData2(List<Woman>list2){~}
	//~printData3(List<Person>list3){~}
}




