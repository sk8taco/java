package j200206;

//����,���ڸ� �Է�->���
import java.io.*;

public class FilterTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//�Ű������� �ڷ����� �θ�Ŭ��������->�θ�Ŭ������ü �Ӹ��ƴ϶� ��Ӱ��迡 �ִ�
		//�ڽ�Ŭ������ ��ü�� �Ű������� ������ ���� �� �ִٴ� �ǹ�
		/*
		 InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(isr);
          Ű����� �о���̴µ� �ѱ۵������� ��� �ѱ��� ������ �ʵ��� �����ϸ�
          �Ѳ����� ���� ���� �����͸� �о���̶�
         */
		BufferedReader br=new BufferedReader
				                          (new InputStreamReader(System.in));
		
		//Scanner sc=new Scanner(System.in);
		String name;
		int kor,eng,tot;
		
		System.out.println("�̸���?");
		name=br.readLine();//name=sc.next() or sc.nextLine()
		
		System.out.println("��������?");
		kor=Integer.parseInt(br.readLine());//"90"->90
		
		System.out.println("��������?");
		eng=Integer.parseInt(br.readLine());//sc.nextInt();
		
		tot=kor+eng;
		System.out.println("�̸�="+name+",����=>"+tot);
		
	}

}





