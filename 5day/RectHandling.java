package j200121;

public class RectHandling {

	public static void main(String[] args) {
		Rect rect1 = new Rect(); // RectŬ������ ���� ��ü ����
		rect1.rectName = "rect1";
		rect1.width = 30;
		rect1.height = 50;
		rect1.calcArea(rect1.width, rect1.height);
		
		Rect rect2 = new Rect(); // �ι�° ��ü ����
		rect2.rectName="rect2";
		rect2.calcArea(30, 60);
		
		System.out.println("rect2�� ���α��̴� : "+rect2.width+"�Դϴ�.");
		System.out.println("rect2�� ���α��̴� : "+rect2.height+"�Դϴ�.");

	}

}