//package com.naver.�μ���.������Ʈ�� ~
package j200116;

public class Op1 {
	public static void main(String[] args) {
		System.out.println("���, ����������");
		/*
		int a=3,b=4; // int a=3; int b=4;
		int c=a+b; 	// �⺻ ���� �ڷ����� int => ����)���� ����?
		double d=3*3*3.141592;
		System.out.println(d);
		*/
		
		int a=4;
		int b=a++;
		/*
		 * int b=a; => b=4
		 * a++ => a=a+1 => ��������� �ڱ⺯���� ���� �ϳ� �������Ѽ� �ڱ⺯���� �� ����
		 * a=4+1; 
		 */
		System.out.println("before a="+a+",before b="+b);
		int c=++a;
		/*
		 * ++a => a=a+1 -> �ٸ� �����ϱ� ���� ���� ������Ų��
		 * a=5+1;
		 * int c=a;
		 */
		System.out.println("a="+a+", b="+b+",c="+c);		
	}
}
