package j200207;

import java.io.Serializable;
//Vector(�޸𸮸� ���� ����,�ҷ����µ� �ӵ�����)<->ArrayList(������ �޸� ��뷮�� ������)
//ȸ������->ȸ���α���->�����ڸ� ȸ�� ��ü ����Ʈ
import java.util.*;//Scanner,ArrayList

//��ü����ȭ�� ������ Ŭ����=>implements Serializable
//Person��ü ������ ���� �Ǵ� �ܺ���ǻ�ͷ� ������ ����
class Person2 implements Serializable{ //����
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class ArrayListTest2 {
	
	//�����͸� ��������  ��ȯ�� getPersonList() { return ����� ��ü;}
	//<->setPersonList(�ҷ��� ��ü�� ��ü��){ ó��~}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("ȸ����?");
         String name=sc.next();
         
         System.out.println("���̴�?");
         int age=sc.nextInt();//sc.nextDouble()->������ �Է�->�Ҽ���
         Person2 p=new Person2();//new Person(name,age);
         p.setName(name);
         p.setAge(age);
         
         Person2 p2=new Person2();
         p2.setName("�ӽ�2");
         p2.setAge(32);
         
         Person2 p3=new Person2();
         p3.setName("�׽�Ʈ��");
         p3.setAge(23);
         //setPersonList(Person p){~}
         ArrayList<Person2> list=new ArrayList<Person2>();
         list.add(p); list.add(p2); list.add(p3);//3���� Person��ü�� ����
         //�޼��� ȣ��
         ArrayListTest2 alt=new ArrayListTest2();
         alt.getPersonList(list);
	}
	
	//PersonList�� ��½����ִ� �޼����ۼ�
	public void getPersonList(ArrayList<Person2> list) {
		//for(int i=0;i<list.size();i++){Person st=list.get(i);~}
		for(Person2 st:list) {
			System.out.println("�̸�="+st.getName());//<%=st.getName()%>
			System.out.println("����="+st.getAge());
			System.out.println("==============");
		}
	}
}




