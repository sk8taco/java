package j200206;
//파일의 내용을 읽어들여서 출력(콘솔에 출력)
import java.io.*;

public class FileInputTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//자바의 입출력시 주의할점 ->\ ->\\ or /
        FileInputStream fis=new FileInputStream
        		                                   ("C:/webtest/3.java/HelloTest.java");
        int read=0;//파일을 읽어들여서 임시로 저장할 변수
        /* (1)
        while(read!=-1) {//read의 값이 -1이 아닌동안
        	read=fis.read();//System.in.read()
        	System.out.write(read);//콘솔에 변환해서 출력하라
        }//while
        */
        //(2)
        while(true) {
        	read=fis.read();//System.in.read()
        	if(read==-1) break;//파일의 내용이 없으면 더이상 진행하지 말고 종료하라
        	System.out.write(read);//콘솔에 변환해서 출력하라
        }
	}

}



