package j200204;
//1.Ư�� �̺�Ʈ�� �߻��� �Ǹ� ���� ó��?  �߻���Ų Ŭ�������� ó��=>����� �޾Ƽ� ó��

import java.awt.*;
import javax.swing.*;//����
//�߰�
import java.awt.event.*;//event��Ű���� �����ϴ� �������̽�,Ŭ����(�̺�Ʈó��)

/*
 * 2.�̺�Ʈ�� �߻��������� �̺�Ʈó���� �ٸ� Ŭ������ ������ִ� ���
 * 
 */
public class WindowTest3 extends JFrame {

	public WindowTest3() {
		setTitle("3.�̸��� �ִ� ����Ŭ������ �̿��ϴ� ���");
		setBounds(400,500,400,300);//x,y,w,h
		//--------------------------------
		/*  Other ot=new Other();
		this.addWindowListener(ot); */
		//---------------------------------
		this.addWindowListener(new Other2());
		setVisible(true);
	}
	//----------------------------------------
	class Other2 extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) { //1���� ������ �ϸ� �ȴ�.
			// TODO Auto-generated method stub
			System.out.println("windowClosing");//��������  x��ư�� Ŭ�������� �ڵ����� ȣ��
			System.exit(0);//��������
		}
	}
	//----------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new WindowTest3();//������ ���� â�� ����
	}
	
}

//�̺�Ʈ�� ��� ó�����ִ� Ŭ������ ���� ���� ȣ��
/*
class Other2 extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) { //1���� ������ �ϸ� �ȴ�.
		// TODO Auto-generated method stub
		System.out.println("windowClosing");//��������  x��ư�� Ŭ�������� �ڵ����� ȣ��
		System.exit(0);//��������
	}
}
*/









