package j200204;

public class Outer {
	
	int a;//0
	public Outer() {
		a=10;//��������� �⺻�������� �ʱ�ȭ
	}
	public void bb() {
		System.out.println("bb ȣ���!!!");
	}
	
	public void aa() {
		System.out.println("aa ȣ���!!!");
		//OuterŬ�������忡�� InnerŬ������ ��ü�� ����->�������,�޼��带 ȣ���� ����
		//cc();
		Inner in=new Inner();
		in.cc();//��ü��.�޼����(~)
	}
	//-------------Inner Class(Outer class�� �������,�޼��� ����ó�� ���)----------------------------
	class Inner {
	     int ax;//int ax=20;
	     public Inner() {
	    	 ax=20;
	     }
	     public void cc() {
	    	 System.out.println("���� ax="+ax+",�ܺ� a=>"+a);
	    	 bb();
	     }
	}
	//------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.OuterŬ������ ��ü����
		Outer out=new Outer();
		//2.main()���� Inner class�� ��� ����?
		//����) OuterŬ������.InnerŬ������ inner��ü��=Outer��ü��.new InnerŬ������()
		Outer.Inner oi=out.new Inner();
		System.out.println("ax=>"+oi.ax);//20
		out.aa();//->Inner in=new Inner()->cc()->bb()
	}
}





