package j200207;
//�÷����� ����->���� Ư¡->���� �迭
import java.util.*;//�÷���,Scanner 

public class VectorTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector v=new Vector();//Vector(1(��������),1(����ġ))
         v.add("�׽�Ʈ");//0 v.add(new String("�׽�Ʈ"));
         v.addElement("�ӽ��׽�Ʈ2");//1
         v.add("�׽�Ʈ2");//2
         System.out.println("v�� ������ ���尹��=>"+v.size());//�ڵ����
         //���� ���
         for(int i=0;i<v.size();i++) {
        	 String temp=(String)v.elementAt(i);//elementAt(�ε�����ȣ)
        	 System.out.println("temp=>"+temp);
         }
         //�پ��� ���� ����=>ũ�Ⱑ �ڵ����� ����
         //Vector<String> v2=new Vector<String>();
         Vector v2=new Vector();
         //char c='a';->��ü��
         /*
         Character c=new Character('a');
         v2.add(c);*/
         v2.add('a');//v2.add(new Character('a'));//0
         // 3.131592
         v2.add(100);//v2.add(new Integer(100));//1->2
         v2.insertElementAt(3.141592,1);//1.�����Ұ�ü�� 2.������ �ε�����ȣ
         //�߸� ����,������ ����->setElementAt(�����Ұ�ü��,������ �ε�����ȣ)
         v2.setElementAt("Set", 2);//100->"Set"
         //���
         for(int i=0;i<v2.size();i++) {
        	 System.out.println("v2�� ��=>"+v2.elementAt(i));//Character
        	 //�����ö� �ڵ����� ����ȯ�� �Ǹ鼭 ����ϰ����ϴ� ���
         }
	}

}








