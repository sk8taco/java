package j200206;
//������ ������ �о�鿩�� ���(�ֿܼ� ���)
import java.io.*;

public class FileInputTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�ڹ��� ����½� �������� ->\ ->\\ or /
        FileInputStream fis=new FileInputStream
        		                                   ("C:/webtest/3.java/HelloTest.java");
        int read=0;//������ �о�鿩�� �ӽ÷� ������ ����
        /* (1)
        while(read!=-1) {//read�� ���� -1�� �ƴѵ���
        	read=fis.read();//System.in.read()
        	System.out.write(read);//�ֿܼ� ��ȯ�ؼ� ����϶�
        }//while
        */
        //(2)
        while(true) {
        	read=fis.read();//System.in.read()
        	if(read==-1) break;//������ ������ ������ ���̻� �������� ���� �����϶�
        	System.out.write(read);//�ֿܼ� ��ȯ�ؼ� ����϶�
        }
	}

}



