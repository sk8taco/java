package j200206;
//키보드로 입력을 받아서 입력받은 값을 그대로 다시 콘솔에 출력
//System.in.read()                       System.out.write(출력대상)
import java.io.*;

public class SimpleIn {

	//간단하게 예외처리를 하는 경우 2번째 패턴을 많이 사용한다.
	public static void main(String[] args)throws Exception { //throws IOException
		// TODO Auto-generated method stub
        //키보드로부터 값을 입력->출력
		int charRead;//영문자,한글,숫자,특수기호=>아스키코드값(숫자형태로 저장)
		                    //System.in.read()->더 이상 읽어들일지 못하면 -1을 리턴(ctrl+z enter)
		//char=>0~65535=>횟수가 정해져 있지 않은경우=>while
		//try{
		System.out.println("입력하고자하는 문자열을 아무거나 입력?");
		while((charRead=System.in.read())>=0) //어떤 글자라도 계속 입력중이라면
			System.out.write(charRead);//저장된 숫자값을 문자로 변환해서 출력
			//System.out.print(charRead);
		//}catch(IOException e){System.out.println(e);}
	}

}






