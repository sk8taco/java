package j200207;

//Wrapper class
public class BoxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("�ڵ� unboxing");
         //unboxing=>�ڹ��� ��ü��(Wrapper)-->�⺻ �ڷ������� ��ȯ
         //int obj=10;
         Integer obj=new Integer(10);
         //int sum=obj.intValue()+20;//10(��ü��)+20(�ڷ���)=>�⺻�ڷ���+20(�⺻�ڷ���)
         int sum=obj+20;//obj.intValue()+20=30(�⺻�ڷ���)
         System.out.println("sum=>"+sum);
         
         System.out.println("�ڵ� boxing");
         //�⺻�ڷ���=>�ڹ��� ��ü���� ��ȯ
         //double d=123.45;
         /*
         Double d=new Double(123.45);//Double�� ��ü d����
         printDouble(d); */
         printDouble(new Double(123.45));//�͸�ü���·� ����
         printDouble(143.67);//double->new Double(143.67)
	}
	static void printDouble(Double obj2) {
	   System.out.println(obj2.toString());//�Ҽ���->���ڷ� ��ȯ���Ѽ� ��½����ִ� ����	
	}                              //"123.45"

}




