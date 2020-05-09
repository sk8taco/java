package j200210.super2;
/*
 * 메서드의 매개변수로써 전달받을때 사용가능한 제너릭
 * 4)<? super T> =>T(자식클래스)를 고정으로 지정해주고 이 자식클래스와 연관이 있는 부모클래스
 *                           는 누구나 다 적용이 된다.(매개변수로 전달)
 */

import java.util.*;

class Test{
	String name;
}
//class Person extends Test{ //부모클래스 T =>Person의 부모인 Test
class Person {
	String name;
	Person(){}//=>주소값이 출력
	//추가
	Person(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
//Man
class Man extends Person{ //T(Man)->자식클래스
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
class Woman extends Person{ //T(자식클래스)
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
		list3.add(new Person("사장님"));
		list3.add(new Person("이사님"));
		printData(list3);
		
		//
		List<Double> list4=new ArrayList<Double>();
		list4.add(12.6); list4.add(45.6); list4.add(78.9);
		printData(list4);
		
	}
	public static void printData(List<?> list) {  //모든 클래스 다 적용(상속과 상관없이)
	//public static void printData(List<? super Person> list) { //Person만 (O),Person의 부모만	
	//public static void printData(List<? super Man> list) {//Man,Man의 부모 Person	  
	//public static void printData(List<? super Woman> list) {//Woman,Person	
		for(Object obj:list)
			System.out.println(obj);//obj.toString();//문자로 출력
	}
    //~printData2(List<Woman>list2){~}
	//~printData3(List<Person>list3){~}
}




