package j200212;
/*
 * Properties클래스->외부에 환경설정파일을 불러오는 기능이 내장->load()
 *                          파일로 저장된 내용을 메모리에 불러올때 사용
 *                          DB연동->~.conf or .properties(주로 디폴트)
 */
import java.io.*;
import java.util.Properties;

public class ProTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.파일을 불러오기
		Properties pro=new Properties();
		try {
			//FileInputStream(영문,환경설정) or FileReader(한글 데이터 불러오기)
			FileInputStream fis=
					new FileInputStream("C:/webtest/3.java/sou/JavaStudy/src/j200212/ex1.properties");
		    pro.load(fis);
		}catch(IOException e) {
			System.out.println("파일 불러오기 오류=>"+e);
		}
		//2.저장된 속성값을 불러오기->getProperty("키명")<->setProperty(키명,저장할값)
		String avalue=pro.getProperty("a");//"testkim"
		System.out.println("a키값의 속성값=>"+avalue);
		//3.저장된 속성명의 속성값을 변경
		pro.setProperty("b", "property test");//"imsi"-->"property test"
		System.out.println("pro.getProperty('b')=>"+pro.getProperty("b"));
		//4.store(속성값을 저장할 파일명,주석(null로 설정))=>동기화(메모리상-->파일에도 반영화)
		try {
			pro.store(new FileOutputStream
			("C:/webtest/3.java/sou/JavaStudy/src/j200212/ex1.properties"), null);
		}catch(IOException e) {e.printStackTrace();}
		
	}
}






