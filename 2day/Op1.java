//package com.naver.부서명.프로젝트명 ~
package j200116;

public class Op1 {
	public static void main(String[] args) {
		System.out.println("산술, 증감연산자");
		/*
		int a=3,b=4; // int a=3; int b=4;
		int c=a+b; 	// 기본 연산 자료형이 int => 예외)원의 면적?
		double d=3*3*3.141592;
		System.out.println(d);
		*/
		
		int a=4;
		int b=a++;
		/*
		 * int b=a; => b=4
		 * a++ => a=a+1 => 재귀적으로 자기변수에 값을 하나 증가시켜서 자기변수에 또 저장
		 * a=4+1; 
		 */
		System.out.println("before a="+a+",before b="+b);
		int c=++a;
		/*
		 * ++a => a=a+1 -> 다른 연산하기 전에 먼저 증가시킨다
		 * a=5+1;
		 * int c=a;
		 */
		System.out.println("a="+a+", b="+b+",c="+c);		
	}
}
