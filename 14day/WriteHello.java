package j200206;

//입출력의 개요->Input(입력)<->Output=>문자 전송(톡)
import java.io.*;//입출력

public class WriteHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -128~127 저장이 가능한 자료형->byte(데이터 전송단위로 출력)
		// H E L L O
		byte hello[] = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10 };
		byte a = 72;
		try {
			// System.out->표준출력장치(모니터,프린터),System.in(표준입력장치->키보드)
			System.out.println(a);// 72
			System.out.println(hello);// hello배열의 저장위치를 출력
			// 입출력할때 특히 출력->버퍼(데이터 저장영역)->어느정도 데이터쌓음->데이터성능향상을 위해
			System.out.write(a);// H->
			System.out.flush();// 버퍼에 저장하지 말고 바로바로 출력하라
			System.out.write(hello);// 입출력할때에는 반드시 예외처리를 해야 된다.
		} catch (IOException e) { // IOException=>Exception(객체자동형변환)
			System.out.println(e);// e.toString()
		}
		
	}
}
