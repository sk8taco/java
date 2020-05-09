package j200205;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("��ü����ȯ(�ڵ�����ȯ)");
         Shape s=new Shape();
         Point p=new Point();
         Line l=new Line();
         Square sq=new Square();
         
         s.shapeDraw();
         p.pointDraw();
         l.lineDraw();
         sq.squareDraw();
         System.out.println("==��ü�ڵ�����ȯ==");
         Shape sh[]=new Shape[4];//��ü�迭
         sh[0]=s;//Shape
         sh[1]=p;//Shape+Point
         sh[2]=l;//Shape+Point+Line
         sh[3]=sq;//sh[3]=new Square();=>Shape s=new Square();
         
         for(int i=0;i<sh.length;i++) {
        	 sh[i].draw();//�޼���� ������ ��ü�� �ٸ��⶧���� ������ ������ �� �ִ�.(=������)
        	 whoAreYou(sh[i]);
         }//for
	}
	//��Ӱ���(=����ȯ)->instanceof������
	//����) Car sonata=new Car();=>if(��ü�� instanceof Ŭ������)==true
	static void whoAreYou(Shape sh) {//�ڵ�����ȯ�� ����
		//Shape
		if(sh instanceof Shape)
			System.out.println("I am Shape");
		else
			System.out.println("I am not Shape");
		//Point
		if(sh instanceof Point)
			System.out.println("I am Point");
		else
			System.out.println("I am not Point");
		//Line
		if(sh instanceof Line)
			System.out.println("I am Line");
		else
			System.out.println("I am not Line");
		//Square
		if(sh instanceof Square)
			System.out.println("I am Square");
		else
			System.out.println("I am not Square");
		System.out.println("==============");
	}
}
//Shape->Point(��)->Line(��)=>Square(�ٰ���)
class Shape{
	//��� ������ �������� ����ϴ� �޼���
	void draw() {
		System.out.println("Shape");
	}
	//Shape���� �޼���
	void shapeDraw() {
		System.out.println("Shape");
	}
}
//is a ����
class Point extends Shape{
	void draw() {
		System.out.println("Point");
	}
	void pointDraw() {
		System.out.println("Point");
	}
}
//Line
class Line extends Point{
	void draw() {
		System.out.println("Line");
	}
	void lineDraw() {
		System.out.println("Line");
	}
}

//Square
class Square extends Line{
	void draw() {
		System.out.println("Square");
	}
	void squareDraw() {
		System.out.println("Square");
	}
}









