package j200206;

//����,���ڸ� �Է�->���
import java.io.*;

public class Sawon {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String mem_name=null;//�̸�
		String mem_id=null;//���
		String mem_pwd=null;//��ȣ
		String mem_gender=null;//����
		String mem_age=null;//����("23")->int mem_age=23;
		String mem_phone=null;//����

		BufferedReader br=new BufferedReader
				                          (new InputStreamReader(System.in));
		
		//�ѱ۷� �����͸� ����->��������(FileWriter, FileOutputStream(������))
		File f=new File("c:/webtest/3.java/sawon.txt");
		FileWriter fw=new FileWriter(f,true);//1.���ϰ�ü  2.���ϼ���(�߰�������·� ����)
		//FileWriter fw=new FileWriter(new File("c:/webtest/3.java/sawon.txt"));
		
		//Scanner sc=new Scanner(System.in);
		System.out.println("===ȸ������ �Է��ϱ�===");
		
		System.out.println("�̸�>>?");
		mem_name=br.readLine();//name=sc.next() or sc.nextLine()
		//ID
		System.out.println("ID?");
		mem_id=br.readLine();//"90"->90
		//pwd
		System.out.println("��ȣ?");
		mem_pwd=br.readLine();
		
		//����
		System.out.println("����?");
		mem_gender=br.readLine();
		
		//����
		System.out.println("����?");
		mem_age=br.readLine();
		
		//����
		System.out.println("����?");
		mem_phone=br.readLine();
		
		//���Ͽ� ����=>FileWriter<->FileReader
		fw.write(mem_name); fw.write("\r\n");//�ٹٲ�
		fw.write(mem_id); fw.write("\r\n");
		fw.write(mem_pwd); fw.write("\r\n");
		fw.write(mem_gender); fw.write("\r\n");
		fw.write(mem_age); fw.write("\r\n");
		fw.write(mem_phone); fw.write("\r\n");
		fw.write("\r\n");//��輱 ����
		fw.close();//��������� ���α׷��� ���̻� read() X write()
		br.close();
	}

}





