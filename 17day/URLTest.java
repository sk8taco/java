package j200211;

//특정사이트에 접속=>홈페이지 파일을 읽어들여서 콘솔에 출력
import java.io.*;//접속->입출력->데이터를 다운로드
import java.net.*;//URL->접속해서 데이터 가져오기

public class URLTest {

	public URLTest(String s) throws Exception{
		//1.URL객체->사이트에 접속
		URL url=new URL(s);//접속할때 반드시 http프로토콜을 써야 된다.
		//2.접속한 컴퓨터-스트림을 이용
		InputStream in=url.openStream();//new(X)
		//3.데이터를 가져오기->저장(변수)->콘솔에 출력
		String ss;
		BufferedReader br=new BufferedReader
				                    (new InputStreamReader(in));//System.in(내 컴퓨터)
		while((ss=br.readLine())!=null) {//계속 읽어들일 수있는 상태라면
			System.out.println(ss);//콘솔에 출력
			//파일에 출력=>FileOutputStream,FileWriter
		}
		in.close(); br.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       URLTest ult=new URLTest("http://www.naver.com");//index.html
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




