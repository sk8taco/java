package j200206;

import java.io.*;

//�޸𸮻� ����� ���� �ڷ����� ������------>���Ϸ� ����(���ڿ�,����,double,boolean,char,)
public class DataInOutTest2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
      //1.���Ϸ� ����
		FileOutputStream fos=new FileOutputStream
				                                   ("c:/webtest/3.java/data.txt");
	  //2.�ڹ��� �ڷ����� �°� ����->��ü�� ������->����(�ٴܰ� ����)
		DataOutputStream dos=new DataOutputStream(fos);
		
	  //3.�޸𸮿� �ڷ����� �°� ����
		char han='��';//0~65535
		System.out.println((int)han);//�ƽ�Ű�ڵ尪 Ȯ��
		byte b=21;
		String str="bg\n";
		byte ba[]= {65,66,67};//A,B,C(��ȯ)
		//���Ϸ� ����=>����)write�ڷ���(�����Ұ�) <->read�ڷ���()
		dos.writeChar(han);
		dos.writeByte(b);//21
		dos.writeBytes(str);//writeString() (X)
		dos.write(ba);//byte[]->�迭�� ���->�������� �����͸� ����,���
		dos.close();
		fos.close();//�޸�����->��½�Ʈ�� ����->close()
		//�ٽ� ���Ϸ� �ҷ��ͼ� �ֿܼ� ���
		DataInputStream dis=new DataInputStream
				             (new FileInputStream("c:/webtest/3.java/data.txt"));
		//������=dis.read�ڷ���();
		char c=dis.readChar();
		byte b1=dis.readByte();
		String s=dis.readLine();//������ ��������� ���
		byte bb[]=new byte[3];//65,66,67
		dis.read(bb);//A,B,C->byte[] bb�� ����
		dis.close();
		//�߰�
		//String str2="ABC";
		String str2=new String(bb);//65,66,67->ABC
		System.out.println("c=>"+c);
		System.out.println("b1=>"+b1);
		System.out.println("s=>"+s);
		System.out.println("bb=>"+bb);//�迭�� �ּҰ� ���
		System.out.println("str2->"+str2);
		//
		//for���� �̿�->��� =>String=>String s=?(byte[])
		/*
		 * byte[]--->String ��ȯ->StringŬ���� ��ü�� ����(�����ڸ� �̿�)
		 * String--->byte[]�� ��ȯ=>StringŬ������ getBytes()�� �̿�
		 */
	}

}



