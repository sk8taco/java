package j200206;
//Ű����� �Է��� �޾Ƽ� �Է¹��� ���� �״�� �ٽ� �ֿܼ� ���
//System.in.read()                       System.out.write(��´��)
import java.io.*;

public class SimpleIn {

	//�����ϰ� ����ó���� �ϴ� ��� 2��° ������ ���� ����Ѵ�.
	public static void main(String[] args)throws Exception { //throws IOException
		// TODO Auto-generated method stub
        //Ű����κ��� ���� �Է�->���
		int charRead;//������,�ѱ�,����,Ư����ȣ=>�ƽ�Ű�ڵ尪(�������·� ����)
		                    //System.in.read()->�� �̻� �о������ ���ϸ� -1�� ����(ctrl+z enter)
		//char=>0~65535=>Ƚ���� ������ ���� �������=>while
		//try{
		System.out.println("�Է��ϰ����ϴ� ���ڿ��� �ƹ��ų� �Է�?");
		while((charRead=System.in.read())>=0) //� ���ڶ� ��� �Է����̶��
			System.out.write(charRead);//����� ���ڰ��� ���ڷ� ��ȯ�ؼ� ���
			//System.out.print(charRead);
		//}catch(IOException e){System.out.println(e);}
	}

}






