package j200213;

public class EnumTest {
    //����(��~��),��(1~12��),�ð�(1~24)->������ ����->���
	 public static final int SUN=0;
     public static final int MON=3;//1.���ڴ�ſ� ���ڿ� ����� ����(����ϱ⽱��.)
	 public static final int TUE=2;//2.�Ѳ����� �������� ������ ���ÿ� �����Ҷ�
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int su1,su2,su3,su4;//�迭
		 su1=SUN;//su1=0
		 su2=MON;//su2=1;
		 System.out.println("su1=>"+su1+",su2=>"+su2);
		 su3=MON; su4=MON;
		 System.out.println("su3=>"+su3+",su4->"+su4);
		 //���1=>������Ŭ������.������ ��� ����
		 System.out.println("===�ܺ��� enum(������)�� ����ϴ� ���===");
		 System.out.println("Day.SUN=>"+Day.SUN);//Ŭ������.�׸�->�׸��ڿ����
		 //������ �׸� �ش��ϴ� ���ڰ� ���
		 System.out.println("Day.SUN.ordinal()=>"+Day.SUN.ordinal());
		 //���2=>������ ��ü��=������Ŭ������.������ �׸�->Ư�� ��������� ����� ����
		 Day d=Day.SUN;//SUN
		 su3=Day.SUN.ordinal();//su3=0�� ����.
		 
		 switch(d) {
		     //case ������Ŭ������.�׸� (X)
		 case SUN:System.out.println("�Ͽ���");break;
		 case MON:System.out.println("������");break;
		 }
	}

}



