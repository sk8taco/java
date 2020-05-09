package j200206;

import java.util.Scanner;

public class InputTest {
    
	//String name;int kor;멤버변수->메서드의 매개변수가 필요없다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);//1.new연산자를 이용
		InputTest it=new InputTest();
		Scanner sc=it.getScan();
		/*
        System.out.println("이름?");
        String name=sc.next();//nextLine()(X)
        System.out.println("국어점수?");
        int kor=sc.nextInt();//sc.nextDouble()
        */
		it.setScan(sc);
	}
	//public 반환형 getXXX(){ return 객체명;}=>3.반환형을 통해서 얻어옴
	public Scanner getScan() { return new Scanner(System.in);}
	
	//2.메서드의 매개변수를 통해서 얻옴->public void setXXXX(얻어올 객체자료형 객체명){~}
	public void setScan(Scanner sc) {
		System.out.println("이름?");
        String name=sc.next();//nextLine()(X)
        System.out.println("국어점수?");
        int kor=sc.nextInt();//sc.nextDouble()=>지역변수=>매개변수가 반드시 존재
        //수우미양가 or A~F =>메서드의 호출유형 4가지
        this.gradePrint(name,kor);
	}
	//gradePrint->누가 점수 ~입니다.
	public void gradePrint(String name,int kor) {
		String grade;//등급
		if(kor>=90) grade="수";//"A"
		else if(kor>=80) grade="우";//"B";
		else if(kor>=70) grade="미";//"C";
		else if(kor>=60) grade="양";//"D";
		else grade="가";//"F";
		System.out.println(name+"님의 등급은"+grade+"입니다.");
	}

}




