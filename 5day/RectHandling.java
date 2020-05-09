package j200121;

public class RectHandling {

	public static void main(String[] args) {
		Rect rect1 = new Rect(); // Rect클래스를 통한 객체 생성
		rect1.rectName = "rect1";
		rect1.width = 30;
		rect1.height = 50;
		rect1.calcArea(rect1.width, rect1.height);
		
		Rect rect2 = new Rect(); // 두번째 객체 생성
		rect2.rectName="rect2";
		rect2.calcArea(30, 60);
		
		System.out.println("rect2의 가로길이는 : "+rect2.width+"입니다.");
		System.out.println("rect2의 세로길이는 : "+rect2.height+"입니다.");

	}

}