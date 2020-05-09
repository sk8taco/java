package j200206;

//문자,숫자를 입력->출력
import java.io.*;

public class Sawon {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String mem_name=null;//이름
		String mem_id=null;//사번
		String mem_pwd=null;//암호
		String mem_gender=null;//성별
		String mem_age=null;//나이("23")->int mem_age=23;
		String mem_phone=null;//전번

		BufferedReader br=new BufferedReader
				                          (new InputStreamReader(System.in));
		
		//한글로 데이터를 저장->파일저장(FileWriter, FileOutputStream(영문자))
		File f=new File("c:/webtest/3.java/sawon.txt");
		FileWriter fw=new FileWriter(f,true);//1.파일객체  2.파일성격(추가모드형태로 열기)
		//FileWriter fw=new FileWriter(new File("c:/webtest/3.java/sawon.txt"));
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("===회원정보 입력하기===");
		
		System.out.println("이름>>?");
		mem_name=br.readLine();//name=sc.next() or sc.nextLine()
		//ID
		System.out.println("ID?");
		mem_id=br.readLine();//"90"->90
		//pwd
		System.out.println("암호?");
		mem_pwd=br.readLine();
		
		//성별
		System.out.println("성별?");
		mem_gender=br.readLine();
		
		//나이
		System.out.println("나이?");
		mem_age=br.readLine();
		
		//전번
		System.out.println("전번?");
		mem_phone=br.readLine();
		
		//파일에 저장=>FileWriter<->FileReader
		fw.write(mem_name); fw.write("\r\n");//줄바꿈
		fw.write(mem_id); fw.write("\r\n");
		fw.write(mem_pwd); fw.write("\r\n");
		fw.write(mem_gender); fw.write("\r\n");
		fw.write(mem_age); fw.write("\r\n");
		fw.write(mem_phone); fw.write("\r\n");
		fw.write("\r\n");//경계선 역할
		fw.close();//파일입출력 프로그램은 더이상 read() X write()
		br.close();
	}

}





