package j200207;

//�����͸� ����(1.���ڿ� ����->2.�ڷ����� �°� ����->3.��ü��ü(�������)�� ���Ϸ� ����
//                                                                ObjectInputStream,ObjectOutputStream
import java.io.*;

class Person implements Serializable{  //����ȭ�� ������ Ŭ����->������
	String name;
	int age;
	transient String addr;//transient �������=>���Ϸ� ������ �ȵȴ�.
}
public class ObjectTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        Person p=new Person();
        p.name="ȫ�浿";
        p.age=34;
        p.addr="��⵵ ����� ~";
        
        //1.���Ϸ� ����->FileOutputStream
        FileOutputStream fos=new FileOutputStream
        		                     ("c:/webtest/3.java/object.txt");
        //2.��ü�� ������ �����ϵ���(�ٸ� Ŭ����)
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //~.writeBytest("ȫ�浿");~.writeInt(34)~writeBytest("��⵵~")
        //oos.writeObject(t1);//Car
        oos.writeObject(p);//Object=>��� ��ü�� ������ �����ϰ� ��������ִ�.
                                     //��ü�ڵ�����ȯ->Person->Object������ ����ż� ����
        oos.close();
        fos.close();
        //������� ������ ������ �ٽ� �о�鿩�� Ȯ���� ���(��ü�� �� Ȯ��)=>������ȭ
        ObjectInputStream ois=new ObjectInputStream
        		(new FileInputStream("c:/webtest/3.java/object.txt"));
        //���� �ִ� ��ǻ�Ϳ� ����<->readObject()->Object��
        //��ü ������� ����ȯ�� �ʿ�->Object->Person������ ����
        Person p2=(Person)ois.readObject();
        //Car t2=(Car)ois.readObject();
        System.out.println("�̸�="+p2.name+",����="+p2.age+",�ּ�=>"+p2.addr);
        
	}

}




