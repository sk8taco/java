package j200206;

import java.util.Scanner;

public class InputTest {
    
	//String name;int kor;�������->�޼����� �Ű������� �ʿ����.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);//1.new�����ڸ� �̿�
		InputTest it=new InputTest();
		Scanner sc=it.getScan();
		/*
        System.out.println("�̸�?");
        String name=sc.next();//nextLine()(X)
        System.out.println("��������?");
        int kor=sc.nextInt();//sc.nextDouble()
        */
		it.setScan(sc);
	}
	//public ��ȯ�� getXXX(){ return ��ü��;}=>3.��ȯ���� ���ؼ� ����
	public Scanner getScan() { return new Scanner(System.in);}
	
	//2.�޼����� �Ű������� ���ؼ� ���->public void setXXXX(���� ��ü�ڷ��� ��ü��){~}
	public void setScan(Scanner sc) {
		System.out.println("�̸�?");
        String name=sc.next();//nextLine()(X)
        System.out.println("��������?");
        int kor=sc.nextInt();//sc.nextDouble()=>��������=>�Ű������� �ݵ�� ����
        //����̾簡 or A~F =>�޼����� ȣ������ 4����
        this.gradePrint(name,kor);
	}
	//gradePrint->���� ���� ~�Դϴ�.
	public void gradePrint(String name,int kor) {
		String grade;//���
		if(kor>=90) grade="��";//"A"
		else if(kor>=80) grade="��";//"B";
		else if(kor>=70) grade="��";//"C";
		else if(kor>=60) grade="��";//"D";
		else grade="��";//"F";
		System.out.println(name+"���� �����"+grade+"�Դϴ�.");
	}

}




