package j200121;

public class Rect {
	String rectName;
	long width;		//�簢���� ���α���
	long height;	//�簢���� ���α���	
	
	void calcArea(long width, long height) {
		// �簢���� ���α��̿� ���α��̸� �Ű������� �޾� ���� ����ϴ� �޼ҵ�
		this.width=width;	
		//��������� ���� �Է����� �ʰ� �Է¹��� �Ű������� ���� ���̸� �Է��ϴ� �͵� ����
		this.height=height;
		long area = width * height;	//���̸� ������ ����
		System.out.println(rectName+"�簢���� ���̴� "+area+"(����)^2 �Դϴ�.");
	}
}
