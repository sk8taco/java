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
public class WindowTest4 extends JFrame {

	public WindowTest4() {
		setTitle("4.�̸��� ���� ����Ŭ������ �̿��ϴ� ���");
		setBounds(400,500,400,300);//x,y,w,h
		//--------------------------------
		/*  Other ot=new Other();
		this.addWindowListener(ot); */
		//---------------------------------
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		setVisible(true);
	}
	//----------------------------------------
	/*
	class Other2 extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) { //1���� ������ �ϸ� �ȴ�.
			// TODO Auto-generated method stub
			System.out.println("windowClosing");//��������  x��ư�� Ŭ�������� �ڵ����� ȣ��
			System.exit(0);//��������
		}
	}*/
	//----------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new WindowTest4();//������ ���� â�� ����
	}
}










