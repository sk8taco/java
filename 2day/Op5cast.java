package j200116;

public class Op5cast {
	public static void main(String[] args) {
	System.out.println("�ڵ� ����ȯ");
	//1. ���� �����Ͱ� ū ������ ������ ���� -> �޸� ���� ����
	short s=12; // ���������� 2���� ���� (128 64 32 16 8 4 2 1)-> 2^0 ���� 2^7���� 
	//		00000000 00001100	16bit
	//	(MSb)
	int n=s;//12
	// 		00000000 00000000 00000000 00001100	32bit 4byte  
	//	(MSb)
	//2. ��� �߰��� �ڷ����� ��ȯ	-> ������������ + ū�������� => ū ������������ ��ȯ
	char c='A';
	int n2=c+1;	// char(2byte) + int(4byte); ( + ��� ������ ���⶧����)
					// char -> int ������ �ڵ�����ȯ �ȴ�.
	System.out.println("n2=>"+n2);	//66-> �ƽ�Ű�ڵ尪 66 -> char
	System.out.println("(char)n2=>"+(char)n2); // �����������ȯ
	// ����� ����ȯ�� ������ ������ �ս��� �ִ�.
	
	int su = (int)3.5; //double
	System.out.println("(int)su=>"+su);
	
	int x= 123;
	float y = x+12.3f;
	//	x -> 00000000 00000000 00000000 01111011
	// y -> float 
	System.out.println(y);
	
	byte s2=12; short s3=45;
	// byte + short = short+short=short(X) --> int 
	//����̱� ������ int�� (int ���� ���� ���� ������)
	int re = s2+s3;
	//�ڹ��� �̽ļ�(�׻� ��������� ��� int ���)
	//����) ��������ȯ �� �� ������ �ƴ϶� ������ ������ ��ȣ�� ��������Ѵ�
	short re2 = (short)(s2+s3);
	System.out.println("re=>"+re);
	System.out.println("re2=>"+re2);
	}
}
