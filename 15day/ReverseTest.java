package j200207;

import java.util.Scanner;
import java.io.*;//입출력

public class ReverseTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ReverseTest rt=new ReverseTest();
		//Scanner sc=new Scanner(System.in);
		//1.객체를 얻어오는 방법 3가지->new
		/*
		BufferedReader br=new BufferedReader
				                    (new InputStreamReader(System.in)); */
		BufferedReader br=rt.getBuffer();//rt.getScan(); rt.getDate();
		rt.setBuffer(br);
		//euc-k(->utf-8)
		/*
		System.out.println("문자열을 입력하세요?");
        //String str=sc.next();
		String str=br.readLine();
        //1.맨 마지막 인덱스번호->str.length()-1
        for(int i=str.length()-1;i>=0;i--)
        System.out.print(str.charAt(i));
        */
	}
	
	//2.메서드의 매개변수를 통해서 얻어오는 방법(매개변수(객체형), 반환형X)
	//형식) public void setXXX(객체를 얻어올 클래스명 객체명){ 처리구문;}
	public void setBuffer(BufferedReader br) { //throws Exception
		try {
		System.out.println("문자열을 입력하세요?");
        //String str=sc.next();
		String str=br.readLine();
        //1.맨 마지막 인덱스번호->str.length()-1
        for(int i=str.length()-1;i>=0;i--)
        System.out.print(str.charAt(i));
		}catch(IOException e) {System.out.println("매개변수가 문제일수가 있다.");}
	}
	
	//3.메서드의 반환형을 통해서 얻어오는 방법
	//=>형식) public 얻어올 클래스자료형 getXXXX(){  return 생성된 객체명 }
	public BufferedReader getBuffer() {
		/*
		 * Scanner sc=new Scanner();
		 * Date d=new Date()
		BufferedReader br=new BufferedReader
                (new InputStreamReader(System.in));
		return br;*/
		return new BufferedReader
                (new InputStreamReader(System.in)); 
	}

}



