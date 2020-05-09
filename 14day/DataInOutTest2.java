package j200206;

import java.io.*;

//메모리상에 저장된 각종 자료형의 데이터------>파일로 저장(문자열,숫자,double,boolean,char,)
public class DataInOutTest2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
      //1.파일로 저장
		FileOutputStream fos=new FileOutputStream
				                                   ("c:/webtest/3.java/data.txt");
	  //2.자바의 자료형에 맞게 포장->객체의 생성자->연결(다단계 결합)
		DataOutputStream dos=new DataOutputStream(fos);
		
	  //3.메모리에 자료형에 맞게 저장
		char han='한';//0~65535
		System.out.println((int)han);//아스키코드값 확인
		byte b=21;
		String str="bg\n";
		byte ba[]= {65,66,67};//A,B,C(변환)
		//파일로 저장=>형식)write자료형(저장할값) <->read자료형()
		dos.writeChar(han);
		dos.writeByte(b);//21
		dos.writeBytes(str);//writeString() (X)
		dos.write(ba);//byte[]->배열의 경우->많은양의 데이터를 저장,출력
		dos.close();
		fos.close();//메모리해제->출력스트림 종료->close()
		//다시 파일로 불러와서 콘솔에 출력
		DataInputStream dis=new DataInputStream
				             (new FileInputStream("c:/webtest/3.java/data.txt"));
		//변수명=dis.read자료형();
		char c=dis.readChar();
		byte b1=dis.readByte();
		String s=dis.readLine();//앞으로 쓰지말라는 경고
		byte bb[]=new byte[3];//65,66,67
		dis.read(bb);//A,B,C->byte[] bb에 저장
		dis.close();
		//추가
		//String str2="ABC";
		String str2=new String(bb);//65,66,67->ABC
		System.out.println("c=>"+c);
		System.out.println("b1=>"+b1);
		System.out.println("s=>"+s);
		System.out.println("bb=>"+bb);//배열의 주소값 출력
		System.out.println("str2->"+str2);
		//
		//for문을 이용->출력 =>String=>String s=?(byte[])
		/*
		 * byte[]--->String 변환->String클래스 객체를 생성(생성자를 이용)
		 * String--->byte[]로 변환=>String클래스의 getBytes()를 이용
		 */
	}

}



