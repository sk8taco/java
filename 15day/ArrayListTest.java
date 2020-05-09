package j200207;

//데이터 관리->추가,수정,삭제,조회
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List구조 내부에 배열이 저장된 구조(인덱스번호로 구분)
        //ArrayList<String> list=new ArrayList<String>();//동적배열
         LinkedList<String> list=new LinkedList<String>();
        //list.add(100);->잘못된 데이터 저장 금지
         list.add("포도");//0->"오렌지"
         list.add("딸기");//1
         //키위------------------>2
         list.add("복숭아");//2->3
         //2.중간에 삽입=>add(삽입할 위치,저장할 객체명)
         list.add(2,"키위");//skip되는 경우=>이 메서드를 사용
         //3.수정->set(수정할 위치,수정할값)
         list.set(0, "오렌지");
         //4.삭제(remove(삭제할 데이터명) or remove(인덱스번호)=>중복된 데이터를 삭제
         list.remove("키위");//list.remove(2);
         //5.조회
         for(int i=0;i<list.size();i++) {//하나씩 꺼내올때 get(인덱스번호)
        	 System.out.println(list.get(i));//v.elementAt(i);
         }
         //검색방법->확장 for문 ->배열이나 컬렉션객체를 하나씩 꺼내올때
         System.out.println("===확장 for문===");
         for(String s:list)  //for(출력할 자료형 출력변수명:배열 또는 컬렉션객체명)
        	 System.out.println(s);
	}
}








