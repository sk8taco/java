package j200204;
//1.Ư�� �̺�Ʈ�� �߻��� �Ǹ� ���� ó��?  �߻���Ų Ŭ�������� ó��=>����� �޾Ƽ� ó��

import java.awt.*;
import javax.swing.*;//����
//�߰�
import java.awt.event.*;//event��Ű���� �����ϴ� �������̽�,Ŭ����(�̺�Ʈó��)
//WindowEvent->WindowListener�������̽� 
public class WindowTest extends JFrame implements WindowListener{

	public WindowTest() {
		setTitle("��ӹ޾� �̺�Ʈó����");
		setBounds(400,500,400,300);//x,y,w,h
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�̺�Ʈ�� �߻�=>�ü������ ��ȣ�� ����
		//����) �̺�Ʈ�߻������.addXXXXListener(�̺�Ʈ�� ó������ ��ü��)
		this.addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new WindowTest();//������ ���� â�� ����
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");//â�� Ȱ��ȭ�ɶ� ȣ��
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		//������â�� ���� �Ŀ� �߻�
	}
    //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");//��������  x��ư�� Ŭ�������� �ڵ����� ȣ��
		System.exit(0);//��������
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");//â�� ��Ȱ��ȭ�ɶ� ȣ��
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");//�۾�ǥ������ â�� ���ö�ͼ� �����ٶ�
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");//�۾�ǥ���ٿ� â�� ������(������ȭ)
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");//â�� �������� ȣ��Ǵ� �޼���
	}
}



