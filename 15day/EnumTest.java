package j200207;
//1.Map에 대한 것과 검색하는 방법(=>select)
import java.util.*;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector();
		v.add("test1"); v.add("test2"); v.add("test3");//elementAt(인덱스번호)
		System.out.println("해쉬테이블(Map)");//키와 저장할값을 연결해서 저장
		//형식)<key의 자료형,key에 저장하는 값의 자료형>
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		//hashtable객체명.put(키명,저장할값)<->hashtable객체명.get(키명)
		h.put(1,"홍길동");h.put(2,"서울시 강남구");h.put(3,"010-123-0987");
		String tel=h.get(3);
		System.out.println("tel=>"+tel);
		//컬렉션의 구조가 다르다 할지라도 공통으로 검색하는 방법=>Enumeration,Iterator
		//인터페이스의 객체를 얻어올 수 있다.
		//Enumeration<String> eu=new Enumeration<String>();
		Enumeration<String> eu=v.elements();//메서드의 반환형
		while(eu.hasMoreElements()) {//검색할 데이터가 들어가 있다면
			System.out.println(eu.nextElement());//하나씩 꺼내와라
		}
		//2.Iterator->도서관의 책꽂이에 들어가 있는 책들을 연상=>책을 꺼내올때의 순서정해져있지않음
		Collection<String> c=h.values();//1.Collection객체를 얻어온다
		Iterator<String> ih=c.iterator();
		//hasNext()->검색된 데이터가 있는지 체크, next()=>찾은 데이터가 있으면 하나씩 꺼내온다.
		while(ih.hasNext()==true) {
			System.out.println(ih.next());//하나씩 꺼내온다.
		}
	}

}




