package j200210;//같은 패키지내에 있는 클래스는 자동으로 인식->관련된 파일

public class GenericExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자료형만 다르고 비슷한 기능을 가진 메서드를 호출->중복코드 생략->간결성
         GenericEx<String> ge=new GenericEx<String>();
         GenericEx<Integer> ge2=new GenericEx<Integer>();
         GenericEx<Double> ge3=new GenericEx<Double>();
         
         String ss[]= {"제너릭","제너릭 종류","제너릭 실습"};
         ge.set(ss);//String[]
         ge.print();//for(String s:v)
         //Integer
         Integer ss2[]= {1,2,3,4,5};
         ge2.set(ss2);//Integer[]
         ge2.print();
         
         //Double
         Double ss3[]= {3.4,5.6,9.8};
         ge3.set(ss3);//Double[]
         ge3.print();
	}

}
