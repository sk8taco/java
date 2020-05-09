package j200121;

public class Rect {
	String rectName;
	long width;		//사각형의 가로길이
	long height;	//사각형의 세로길이	
	
	void calcArea(long width, long height) {
		// 사각형의 가로길이와 세로길이를 매개변수로 받아 넓이 계산하는 메소드
		this.width=width;	
		//멤버변수에 직접 입력하지 않고 입력받은 매개변수를 통해 길이를 입력하는 것도 가능
		this.height=height;
		long area = width * height;	//넓이를 저장할 변수
		System.out.println(rectName+"사각형의 넓이는 "+area+"(단위)^2 입니다.");
	}
}
