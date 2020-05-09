package j200207;

import java.io.Serializable;
//Vector(메모리를 많이 차지,불러오는데 속도느림)<->ArrayList(가볍고 메모리 사용량도 적은것)
//회원가입->회원로그인->관리자만 회원 전체 리스트
import java.util.*;//Scanner,ArrayList

//객체직렬화가 가능한 클래스=>implements Serializable
//Person객체 정보를 파일 또는 외부컴퓨터로 데이터 전송
class Person2 implements Serializable{ //빈즈
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class ArrayListTest2 {
	
	//데이터를 가져오는  반환형 getPersonList() { return 저장된 객체;}
	//<->setPersonList(불러올 객체형 객체명){ 처리~}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("회원명?");
         String name=sc.next();
         
         System.out.println("나이는?");
         int age=sc.nextInt();//sc.nextDouble()->몸무게 입력->소수점
         Person2 p=new Person2();//new Person(name,age);
         p.setName(name);
         p.setAge(age);
         
         Person2 p2=new Person2();
         p2.setName("임시2");
         p2.setAge(32);
         
         Person2 p3=new Person2();
         p3.setName("테스트김");
         p3.setAge(23);
         //setPersonList(Person p){~}
         ArrayList<Person2> list=new ArrayList<Person2>();
         list.add(p); list.add(p2); list.add(p3);//3명의 Person객체를 저장
         //메서드 호출
         ArrayListTest2 alt=new ArrayListTest2();
         alt.getPersonList(list);
	}
	
	//PersonList을 출력시켜주는 메서드작성
	public void getPersonList(ArrayList<Person2> list) {
		//for(int i=0;i<list.size();i++){Person st=list.get(i);~}
		for(Person2 st:list) {
			System.out.println("이름="+st.getName());//<%=st.getName()%>
			System.out.println("나이="+st.getAge());
			System.out.println("==============");
		}
	}
}




