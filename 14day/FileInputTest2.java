package j200206;
//������ ������ �о�鿩�� ���(�ֿܼ� ���)
import java.io.*;

public class FileInputTest2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�ڹ��� ����½� �������� ->\ ->\\ or /
		//����=>����,����,������,�̹�������,�������ϵ� ���� (epp420_64bit.exe),~.jpg,~.gif
        FileInputStream fis=new FileInputStream
        		                                   ("C:/webtest/3.java/epp420_64bit.exe");
        /* (1)
        FileOutputStream fos=new FileOutputStream
                                                  ("C:/webtest/3.java/aaa.exe");
        */
        /* (2) File��ü�� ���� �����ؼ� �������� �Ű������� �����ϴ� ���
        File f=new File("C:/webtest/3.java/bbb.exe");
        FileOutputStream fos=new FileOutputStream(f);
        //(3)
         * 
        */
        FileOutputStream fos=new FileOutputStream
        		                    (new File("C:/webtest/3.java/ccc.exe"));
        
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
        	//System.out.write(read);//�ֿܼ� ��ȯ�ؼ� ����϶�
        	fos.write(read);
        }
	}

}



