package j200116;

public class Op5cast {
	public static void main(String[] args) {
	System.out.println("자동 형변환");
	//1. 작은 데이터가 큰 데이터 공간에 저장 -> 메모리 낭비가 심함
	short s=12; // 내부적으로 2진수 저장 (128 64 32 16 8 4 2 1)-> 2^0 부터 2^7까지 
	//		00000000 00001100	16bit
	//	(MSb)
	int n=s;//12
	// 		00000000 00000000 00000000 00001100	32bit 4byte  
	//	(MSb)
	//2. 계산 중간에 자료형이 변환	-> 작은데이터형 + 큰데이터형 => 큰 데이터형으로 변환
	char c='A';
	int n2=c+1;	// char(2byte) + int(4byte); ( + 라는 연산이 들어가기때문에)
					// char -> int 형으로 자동형변환 된다.
	System.out.println("n2=>"+n2);	//66-> 아스키코드값 66 -> char
	System.out.println("(char)n2=>"+(char)n2); // 명시적인형변환
	// 명시적 형변환의 단점은 데이터 손실이 있다.
	
	int su = (int)3.5; //double
	System.out.println("(int)su=>"+su);
	
	int x= 123;
	float y = x+12.3f;
	//	x -> 00000000 00000000 00000000 01111011
	// y -> float 
	System.out.println(y);
	
	byte s2=12; short s3=45;
	// byte + short = short+short=short(X) --> int 
	//계산이기 때문에 int형 (int 보다 작은 범위 내에서)
	int re = s2+s3;
	//자바의 이식성(항상 산술연산자 경우 int 고수)
	//주의) 강제형변환 할 때 변수가 아니라 수식일 때에는 괄호로 묶어줘야한다
	short re2 = (short)(s2+s3);
	System.out.println("re=>"+re);
	System.out.println("re2=>"+re2);
	}
}
