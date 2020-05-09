package j200116;

public class Op3 {
	public static void main(String[] args) {
		int t1=3,t2=5,t3=7;
		int t4;
		boolean b1,b2,b3; // 변수는 선언되었지만 아직 값이 저장되지 않은 상태
		boolean b4=true; //(3>2) 가능
		
		// (3>5) ? 
		System.out.println("(t1>t2)=> "+(t1>t2));
		// (5<7)
		System.out.println("(t2<t3)=> "+(t2<t3));
		//** 관계,논리연산자 혼합(3>5) && (5<7) **
		b1=(t1>t2)&&(t2<t3);
		System.out.println("(t1>t2)&&(t2<t3)=> "+b1);
		b2=(t1>t2)||(t2<t3);
		System.out.println("(t1>t2)||(t2<t3)=> "+b2);
		
		//!
		b3 = !b4;// T-->F, , F-->T
		System.out.println("!b4=>"+b3);//F
		//모두평가 (&,|,^)
		//&
		b1=(t1>t2)&(t2<t3);
		System.out.println("(t1>t2)&(t2<t3)=> "+b1);
		//|
		b2=(t1>t2)|(t2<t3);
		System.out.println("(t1>t2)|(t2<t3)=> "+b2);
		//^ 서로 값이 다르면 T, 같으면 F
		b3=(t1>t2)^(t2<t3);
		System.out.println("(t1>t2)^(t2<t3)=>"+b3);
	}
}
