package j200207;

//������ ����->�߰�,����,����,��ȸ
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List���� ���ο� �迭�� ����� ����(�ε�����ȣ�� ����)
        //ArrayList<String> list=new ArrayList<String>();//�����迭
         LinkedList<String> list=new LinkedList<String>();
        //list.add(100);->�߸��� ������ ���� ����
         list.add("����");//0->"������"
         list.add("����");//1
         //Ű��------------------>2
         list.add("������");//2->3
         //2.�߰��� ����=>add(������ ��ġ,������ ��ü��)
         list.add(2,"Ű��");//skip�Ǵ� ���=>�� �޼��带 ���
         //3.����->set(������ ��ġ,�����Ұ�)
         list.set(0, "������");
         //4.����(remove(������ �����͸�) or remove(�ε�����ȣ)=>�ߺ��� �����͸� ����
         list.remove("Ű��");//list.remove(2);
         //5.��ȸ
         for(int i=0;i<list.size();i++) {//�ϳ��� �����ö� get(�ε�����ȣ)
        	 System.out.println(list.get(i));//v.elementAt(i);
         }
         //�˻����->Ȯ�� for�� ->�迭�̳� �÷��ǰ�ü�� �ϳ��� �����ö�
         System.out.println("===Ȯ�� for��===");
         for(String s:list)  //for(����� �ڷ��� ��º�����:�迭 �Ǵ� �÷��ǰ�ü��)
        	 System.out.println(s);
	}
}








