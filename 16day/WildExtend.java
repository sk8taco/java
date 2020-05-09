package j200210;
/*
 * 메서드의 매개변수로써 전달받을때 사용가능한 제너릭
 * 3)<? extends T>=>상속관계로 이루어진 클래스만 자료형으로 받겠다는 표시
 *    ? (자식클래스(Man,Woman), T(부모클래스인 Person)
 *    부모클래스 뿐만아니라 자식클래스만 임의의 자료형을 메서드의 매개변수로 받아서 처리해주겠다는 표시
 */

import java.util.*;

class Test{     //부모클래스 T
	String name;
}

class Person{ //부모클래스 T
	String name;
	//Person(){}=>주소값이 출력
}
//Man
class Man extends Person{
	//String name;
	Man(String name){
		this.name=name;//?.name="임시";
	}
	//public String getName() { return name;}
	@Override
	public String toString() {  //Men m=new Men("임시");
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
		//Man m=new Man("임시");
		list.add(new Man("임시"));
		list.add(new Man("테스트"));
		printData(list);
		
		//Woman
		List<Woman> list2=new ArrayList<Woman>();
		//Man m=new Man("임시");
		list2.add(new Woman("유관순"));
		list2.add(new Woman("신사임당"));
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
	//public static void printData(List<?> list) {  //모든 클래스 다 적용
	public static void printData(List<? extends Person> list) {	
		for(Object obj:list)
			System.out.println(obj);//obj.toString();//문자로 출력
	}
    //~printData2(List<Woman>list2){~}
	//~printData3(List<Person>list3){~}
}




