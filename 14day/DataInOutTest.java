package j200206;

import java.io.*;

//�޸𸮻� ����� ���� �ڷ����� ������------>���Ϸ� ����(���ڿ�,����,double,boolean,char,)
public class DataInOutTest {

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
	}

}



