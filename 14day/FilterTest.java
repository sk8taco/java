package j200206;

//문자,숫자를 입력->출력
import java.io.*;

public class FilterTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//매개변수의 자료형이 부모클래스지정->부모클래스객체 뿐만아니라 상속관계에 있는
		//자식클래스의 객체도 매개변수로 전달을 받을 수 있다는 의미
		/*
		 InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(isr);
          키보드로 읽어들이는데 한글데이터인 경우 한글이 깨지지 않도록 설정하면
          한꺼번에 많은 양의 데이터를 읽어들이라
         */
		BufferedReader br=new BufferedReader
				                          (new InputStreamReader(System.in));
		
		//Scanner sc=new Scanner(System.in);
		String name;
		int kor,eng,tot;
		
		System.out.println("이름은?");
		name=br.readLine();//name=sc.next() or sc.nextLine()
		
		System.out.println("국어점수?");
		kor=Integer.parseInt(br.readLine());//"90"->90
		
		System.out.println("영어점수?");
		eng=Integer.parseInt(br.readLine());//sc.nextInt();
		
		tot=kor+eng;
		System.out.println("이름="+name+",총점=>"+tot);
		
	}

}





