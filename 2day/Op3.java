package j200116;

public class Op3 {
	public static void main(String[] args) {
		int t1=3,t2=5,t3=7;
		int t4;
		boolean b1,b2,b3; // ������ ����Ǿ����� ���� ���� ������� ���� ����
		boolean b4=true; //(3>2) ����
		
		// (3>5) ? 
		System.out.println("(t1>t2)=> "+(t1>t2));
		// (5<7)
		System.out.println("(t2<t3)=> "+(t2<t3));
		//** ����,�������� ȥ��(3>5) && (5<7) **
		b1=(t1>t2)&&(t2<t3);
		System.out.println("(t1>t2)&&(t2<t3)=> "+b1);
		b2=(t1>t2)||(t2<t3);
		System.out.println("(t1>t2)||(t2<t3)=> "+b2);
		
		//!
		b3 = !b4;// T-->F, , F-->T
		System.out.println("!b4=>"+b3);//F
		//����� (&,|,^)
		//&
		b1=(t1>t2)&(t2<t3);
		System.out.println("(t1>t2)&(t2<t3)=> "+b1);
		//|
		b2=(t1>t2)|(t2<t3);
		System.out.println("(t1>t2)|(t2<t3)=> "+b2);
		//^ ���� ���� �ٸ��� T, ������ F
		b3=(t1>t2)^(t2<t3);
		System.out.println("(t1>t2)^(t2<t3)=>"+b3);
	}
}
