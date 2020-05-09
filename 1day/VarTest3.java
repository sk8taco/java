package j200115;

public class VarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("논리적인 값");
		boolean b=true;
		boolean b2=2>3;
		System.out.println("b=>"+b+",b2=>"+b2);
		System.out.println("문자형(char,String)");
		char c1 = 'A'; // ASCI 코드값 : 65
		char c2 = 65; // int c2= 65; -> 숫자65 char c2 =65 -> 아스키코드값
		//16진수 형태로 입력을 받아서 문자를 저장? '\u0000' ~ '\uffff' -> 문자형태로 16진수
		
		char c3 = '\u0041'; // 16진수형태로 문자를 저장
		/*
		 * 숫자(2,8,10,16 진수)로 저장하는 경우
		 * 45(10진수) 045(8진수로 저장) 0X45(16진수) 
		 */
		System.out.println("c1:"+c1+",c2:"+c2+"c3:"+c3);
		// 문자열 -> 문자+문자  -> 'a' + 'b' => "ab"
		// 문자열 -> 문자열 + 문자열 => "ab"+"cd" => "abcd"
		String s1 = "식별자 자바기초 문법";
		String s2 = "변수,자료형,연산자";
		String s3 = s1+" "+s2;
		System.out.println("s3:"+s3);
	}

}
