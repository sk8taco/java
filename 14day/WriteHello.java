package j200206;

//������� ����->Input(�Է�)<->Output=>���� ����(��)
import java.io.*;//�����

public class WriteHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -128~127 ������ ������ �ڷ���->byte(������ ���۴����� ���)
		// H E L L O
		byte hello[] = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10 };
		byte a = 72;
		try {
			// System.out->ǥ�������ġ(�����,������),System.in(ǥ���Է���ġ->Ű����)
			System.out.println(a);// 72
			System.out.println(hello);// hello�迭�� ������ġ�� ���
			// ������Ҷ� Ư�� ���->����(������ ���念��)->������� �����ͽ���->�����ͼ�������� ����
			System.out.write(a);// H->
			System.out.flush();// ���ۿ� �������� ���� �ٷιٷ� ����϶�
			System.out.write(hello);// ������Ҷ����� �ݵ�� ����ó���� �ؾ� �ȴ�.
		} catch (IOException e) { // IOException=>Exception(��ü�ڵ�����ȯ)
			System.out.println(e);// e.toString()
		}
		
	}
}
