package j200212;

//Ư������Ʈ�� ����=>Ȩ������ ������ �о�鿩�� �ֿܼ� ���
//����->�����->�����͸� �ٿ�ε�
import java.io.*;

//URL->�����ؼ� ������ ��������
import java.net.URL;
//import java.util.Scanner;

public class URLTest2 {

	public URLTest2(String s) throws Exception{
		//1.URL��ü->����Ʈ�� ����
		URL url=new URL(s);//�����Ҷ� �ݵ�� http���������� ��� �ȴ�.
		//2.������ ��ǻ��-��Ʈ���� �̿�
		InputStream in=url.openStream();//new(X)
		//3.�����͸� ��������->����(����)->�ֿܼ� ���
		String ss;
		BufferedReader br=new BufferedReader
				                    (new InputStreamReader(in));//System.in(�� ��ǻ��)
		//�߰�
		FileWriter fw=new FileWriter("c:/webtest/3.java/url.txt");
		while((ss=br.readLine())!=null) {//��� �о���� ���ִ� ���¶��
			System.out.println(ss);//�ֿܼ� ���
			//���Ͽ� ���=>FileOutputStream,FileWriter
			fw.write(ss);
		}
		in.close(); br.close();fw.close();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//import�� ���ϴ� ���=>�ֻ�����Ű����.������Ű����...�ҷ��� Ŭ������
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("������ ����Ʈ��?(http://�������̸�)");
		String domain=sc.next();//or nextLine()
		new URLTest2(domain);
       //URLTest2 ult=new URLTest2("http://www.chosun.com");//index.html
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




