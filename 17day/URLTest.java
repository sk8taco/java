package j200211;

//Ư������Ʈ�� ����=>Ȩ������ ������ �о�鿩�� �ֿܼ� ���
import java.io.*;//����->�����->�����͸� �ٿ�ε�
import java.net.*;//URL->�����ؼ� ������ ��������

public class URLTest {

	public URLTest(String s) throws Exception{
		//1.URL��ü->����Ʈ�� ����
		URL url=new URL(s);//�����Ҷ� �ݵ�� http���������� ��� �ȴ�.
		//2.������ ��ǻ��-��Ʈ���� �̿�
		InputStream in=url.openStream();//new(X)
		//3.�����͸� ��������->����(����)->�ֿܼ� ���
		String ss;
		BufferedReader br=new BufferedReader
				                    (new InputStreamReader(in));//System.in(�� ��ǻ��)
		while((ss=br.readLine())!=null) {//��� �о���� ���ִ� ���¶��
			System.out.println(ss);//�ֿܼ� ���
			//���Ͽ� ���=>FileOutputStream,FileWriter
		}
		in.close(); br.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       URLTest ult=new URLTest("http://www.naver.com");//index.html
       //www.naver.com=>���ȹ��� ���Ƴ���
	}
	/*
	 *  ���Ȼ� ����Ʈ ���ӱ���
<html>
<head><title>302 Found</title></head>
<body>
<center><h1>302 Found</h1></center>
<hr><center> NWS </center>
</body>
</html>
	 */
}




