package j200116;
//System.out.printf

public class Op6Cast2 {
	public static void main(String[] args) {
		int num1=20,num2=30;
		//����) printf(��¾��,����Ҵ����) -> %d ������, %c ����, %s ���ڿ� %f �Ҽ���
		System.out.printf("ù��° ����=%d, �ι�° ����=%d\n",num1,num2);
		System.out.printf("�� ������ �� = %d",num1+num2);
		System.out.println();
		System.out.println('\n');
		System.out.println("ù���� ����="+num1+"�ι�° ����="+num2);
		
		// ����ȯ
		char ch='A';
		//--------------------------------
		System.out.printf("���� %c�� �����ڵ尪�� %d\n",ch,(int)ch);
		//--------------------------------
		System.out.println("ch=>"+ch);
		//---------------------------------
		int ch2 = ch; // char => int
		System.out.println(ch2);
		//----------------------------------
		int java = 90,jsp=85,oracle=70;
		int sum=java+jsp+oracle;
		System.out.printf("sum=%d�Դϴ�.\n",sum);
		System.out.println("sum="+sum+"�Դϴ�.");
		//���
		int avg=sum/3;
		double avg2= (sum/3);
		double avg3=(double)sum/3;
		double avg4= (sum*100/3);
		System.out.println("avg="+avg);
		System.out.println("avg2="+avg2);
		System.out.println("avg3="+avg3);
		System.out.println("avg4="+avg4/100);
		
		//����) %f -? %.�Ҽ����ڸ���f->%.2f
		System.out.printf("���(avg5):%.2f",avg3);

		
	}
}
