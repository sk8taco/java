package j200205;

//caller method--->worker method=>�������� �߻�
public class ExceptionTest2 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		/*
        int i=0;//÷��
        String greetings[]= {"��ü����ȯ","����ó��","����ó�� ���"};
        while(i<4) {
        	System.out.println(greetings[i]);
        	i++;
        }//while
        */
		try {
			ExceptionTest2 et=new ExceptionTest2();
			et.go();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ÷�ڰ� ��� �ε�����ȣ�� �ֽ��ϴ�.�� ã�ƺ�����");
			System.out.println(e.getMessage());//������ �����޼���
			System.out.println(e);//e.toString()ȣ��=>�߰����� ����
			e.printStackTrace();//���� �ڼ��ϰ� �������� ������ ����
		}
		System.out.println("����ó�� ����!!");
	}
	
	//1.��Ź�ϴ� ��� �޼����() throws �߻��� ����ó��Ŭ������
	public void go() throws ArrayIndexOutOfBoundsException{
		int i=0;//÷��
        String greetings[]= {"��ü����ȯ","����ó��","����ó�� ���"};
        while(i<4) {
        	System.out.println(greetings[i]);
        	i++;
        }
	}
	
}
