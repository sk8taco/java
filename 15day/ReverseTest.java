package j200207;

import java.util.Scanner;
import java.io.*;//�����

public class ReverseTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ReverseTest rt=new ReverseTest();
		//Scanner sc=new Scanner(System.in);
		//1.��ü�� ������ ��� 3����->new
		/*
		BufferedReader br=new BufferedReader
				                    (new InputStreamReader(System.in)); */
		BufferedReader br=rt.getBuffer();//rt.getScan(); rt.getDate();
		rt.setBuffer(br);
		//euc-k(->utf-8)
		/*
		System.out.println("���ڿ��� �Է��ϼ���?");
        //String str=sc.next();
		String str=br.readLine();
        //1.�� ������ �ε�����ȣ->str.length()-1
        for(int i=str.length()-1;i>=0;i--)
        System.out.print(str.charAt(i));
        */
	}
	
	//2.�޼����� �Ű������� ���ؼ� ������ ���(�Ű�����(��ü��), ��ȯ��X)
	//����) public void setXXX(��ü�� ���� Ŭ������ ��ü��){ ó������;}
	public void setBuffer(BufferedReader br) { //throws Exception
		try {
		System.out.println("���ڿ��� �Է��ϼ���?");
        //String str=sc.next();
		String str=br.readLine();
        //1.�� ������ �ε�����ȣ->str.length()-1
        for(int i=str.length()-1;i>=0;i--)
        System.out.print(str.charAt(i));
		}catch(IOException e) {System.out.println("�Ű������� �����ϼ��� �ִ�.");}
	}
	
	//3.�޼����� ��ȯ���� ���ؼ� ������ ���
	//=>����) public ���� Ŭ�����ڷ��� getXXXX(){  return ������ ��ü�� }
	public BufferedReader getBuffer() {
		/*
		 * Scanner sc=new Scanner();
		 * Date d=new Date()
		BufferedReader br=new BufferedReader
                (new InputStreamReader(System.in));
		return br;*/
		return new BufferedReader
                (new InputStreamReader(System.in)); 
	}

}



