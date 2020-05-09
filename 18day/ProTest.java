package j200212;
/*
 * PropertiesŬ����->�ܺο� ȯ�漳�������� �ҷ����� ����� ����->load()
 *                          ���Ϸ� ����� ������ �޸𸮿� �ҷ��ö� ���
 *                          DB����->~.conf or .properties(�ַ� ����Ʈ)
 */
import java.io.*;
import java.util.Properties;

public class ProTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.������ �ҷ�����
		Properties pro=new Properties();
		try {
			//FileInputStream(����,ȯ�漳��) or FileReader(�ѱ� ������ �ҷ�����)
			FileInputStream fis=
					new FileInputStream("C:/webtest/3.java/sou/JavaStudy/src/j200212/ex1.properties");
		    pro.load(fis);
		}catch(IOException e) {
			System.out.println("���� �ҷ����� ����=>"+e);
		}
		//2.����� �Ӽ����� �ҷ�����->getProperty("Ű��")<->setProperty(Ű��,�����Ұ�)
		String avalue=pro.getProperty("a");//"testkim"
		System.out.println("aŰ���� �Ӽ���=>"+avalue);
		//3.����� �Ӽ����� �Ӽ����� ����
		pro.setProperty("b", "property test");//"imsi"-->"property test"
		System.out.println("pro.getProperty('b')=>"+pro.getProperty("b"));
		//4.store(�Ӽ����� ������ ���ϸ�,�ּ�(null�� ����))=>����ȭ(�޸𸮻�-->���Ͽ��� �ݿ�ȭ)
		try {
			pro.store(new FileOutputStream
			("C:/webtest/3.java/sou/JavaStudy/src/j200212/ex1.properties"), null);
		}catch(IOException e) {e.printStackTrace();}
		
	}
}






