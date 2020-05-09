package j200116;
//삼항연산자, 대입연산자
public class Op4 {
	public static void main(String[] args) {
		System.out.println("대입,삼항연산자");
		int a=5,b=7,x=10,y=-10;
		//삼항연산자 : 변수명=(조건식)? 참 : 거짓;
		int absX = (x>=0) ? x : -x;
		System.out.println("x=10일때 x의 절대값=>"+absX);
		int absY= (y>=0)?y:-y;
		System.out.println("y=10일때 y의 절대값=>"+absY);
		//a=a+1 => a++, b=b-1 => b--
		//a+=1				b-=1
		//증가,감소 값이 1 이상일때 주로 사용
		//a=a+b> a+=b, +=,-=,*=,/=,.%= (실행속도가 빠르다)  연산자가 1개로 계산된다
		
		a+=b; // a=a+b;
		System.out.println("a=>"+a);
		a-=b;
		System.out.println("a=>"+a);
		a*=b;
		System.out.println("a=>"+a);
		a/=b; // 소수점이 나오ㅕ면 소수점은 버려진다.(기본연산 : int)
		System.out.println("a=>"+a);
		a%=b;
		System.out.println("a=>"+a); //5
		
		
	}
}
