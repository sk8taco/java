package j200210;//���� ��Ű������ �ִ� Ŭ������ �ڵ����� �ν�->���õ� ����

public class GenericExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڷ����� �ٸ��� ����� ����� ���� �޼��带 ȣ��->�ߺ��ڵ� ����->���Ἲ
         GenericEx<String> ge=new GenericEx<String>();
         GenericEx<Integer> ge2=new GenericEx<Integer>();
         GenericEx<Double> ge3=new GenericEx<Double>();
         
         String ss[]= {"���ʸ�","���ʸ� ����","���ʸ� �ǽ�"};
         ge.set(ss);//String[]
         ge.print();//for(String s:v)
         //Integer
         Integer ss2[]= {1,2,3,4,5};
         ge2.set(ss2);//Integer[]
         ge2.print();
         
         //Double
         Double ss3[]= {3.4,5.6,9.8};
         ge3.set(ss3);//Double[]
         ge3.print();
	}

}
