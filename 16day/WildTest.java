package j200210;
//2.<?> 와일드 카드를 이용한 제너릭 방법=>메서드 호출시 매개변수값을 전달
import java.util.*;//List
public class WildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //인터페이스 객체=new 인터페이스(X) ->new 자식클래스명
		//List list=new List();(X)=>List list=new ArrayList();(O)
		//ArrayList<String> list=new ArrayList<String>();
		//1.문자열
		List<String> list=new ArrayList<String>();
		list.add("테스트1"); list.add("테스트2"); list.add("테스트3");
		printData(list);
		
		//2.정수형
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(100); list2.add(200); list2.add(new Integer(300));
		printData(list2);
		
		//3.소수점저장
		List<Double> list3=new ArrayList();
		list3.add(12.5); list3.add(45.6); list3.add(78.9);
		printData(list3);
	}
	
	//출력값을 처리해주는 일반클래스의 일반메서드-><?>매개변수를 전달받을때 자료형은 그때그때 마다 바뀔수 있다.
	public static void printData(List<?> list) {//객체자동 형변환
		for(Object obj:list)
			System.out.println(obj);//obj.toString()->문자로 변환돼서 출력
	}
	/*
	public static void printData2(List<Integer> list) {
		for(Integer obj:list)
			System.out.println(obj);//obj.toString()->문자출력
	}
	
	public static void printData3(List<Double> list) {
		for(Double obj:list)
			System.out.println(obj);//obj.toString()->문자출력
	}
   */
}
