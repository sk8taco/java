package j200212;

//특정사이트에 접속=>홈페이지 파일을 읽어들여서 콘솔에 출력
//접속->입출력->데이터를 다운로드
import java.io.*;

//URL->접속해서 데이터 가져오기
import java.net.URL;
//import java.util.Scanner;

public class URLTest2 {

	public URLTest2(String s) throws Exception{
		//1.URL객체->사이트에 접속
		URL url=new URL(s);//접속할때 반드시 http프로토콜을 써야 된다.
		//2.접속한 컴퓨터-스트림을 이용
		InputStream in=url.openStream();//new(X)
		//3.데이터를 가져오기->저장(변수)->콘솔에 출력
		String ss;
		BufferedReader br=new BufferedReader
				                    (new InputStreamReader(in));//System.in(내 컴퓨터)
		//추가
		FileWriter fw=new FileWriter("c:/webtest/3.java/url.txt");
		while((ss=br.readLine())!=null) {//계속 읽어들일 수있는 상태라면
			System.out.println(ss);//콘솔에 출력
			//파일에 출력=>FileOutputStream,FileWriter
			fw.write(ss);
		}
		in.close(); br.close();fw.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//import를 안하는 방법=>최상위패키지명.하위패키지명...불러올 클래스명
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("접속할 사이트명?(http://도메인이름)");
		String domain=sc.next();//or nextLine()
		new URLTest2(domain);
       //URLTest2 ult=new URLTest2("http://www.chosun.com");//index.html
       //www.naver.com=>보안문제 막아놓음
	}
	/*
	 *  보안상 사이트 접속금지
<html>
<head><title>302 Found</title></head>
<body>
<center><h1>302 Found</h1></center>
<hr><center> NWS </center>
</body>
</html>
	 */
}




