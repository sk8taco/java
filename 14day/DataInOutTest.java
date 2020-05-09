package j200206;

import java.io.*;

//메모리상에 저장된 각종 자료형의 데이터------>파일로 저장(문자열,숫자,double,boolean,char,)
public class DataInOutTest {

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
	}

}



