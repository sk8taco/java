package j200116;
//���׿�����, ���Կ�����
public class Op4 {
	public static void main(String[] args) {
		System.out.println("����,���׿�����");
		int a=5,b=7,x=10,y=-10;
		//���׿����� : ������=(���ǽ�)? �� : ����;
		int absX = (x>=0) ? x : -x;
		System.out.println("x=10�϶� x�� ���밪=>"+absX);
		int absY= (y>=0)?y:-y;
		System.out.println("y=10�϶� y�� ���밪=>"+absY);
		//a=a+1 => a++, b=b-1 => b--
		//a+=1				b-=1
		//����,���� ���� 1 �̻��϶� �ַ� ���
		//a=a+b> a+=b, +=,-=,*=,/=,.%= (����ӵ��� ������)  �����ڰ� 1���� ���ȴ�
		
		a+=b; // a=a+b;
		System.out.println("a=>"+a);
		a-=b;
		System.out.println("a=>"+a);
		a*=b;
		System.out.println("a=>"+a);
		a/=b; // �Ҽ����� �����Ÿ� �Ҽ����� ��������.(�⺻���� : int)
		System.out.println("a=>"+a);
		a%=b;
		System.out.println("a=>"+a); //5
		
		
	}
}
