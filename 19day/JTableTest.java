package j200213;

//2���� ǥ���·� �����Ǵ� ������Ʈ->JTable

import java.awt.*;
import javax.swing.*;
/*
 * MVC ��->1.Model->������ ���念��(�迭�� ����)
 *                 2.View->������ ������Ʈ(=JTable,JScrollPane)
 *                 3.Controller->Model--->JTable�� �����ؼ� ���ϴ� �����͸� �����ٰ��ΰ��� ����
 */
public class JTableTest extends JFrame{

	JTable table;//������ų ������Ʈ�� �����ڿ��� ���� ����,������ ����
	
	public JTableTest() {
		setTitle("JTable ��������");
		//-----------Model-------------
		String header[]= {"�̸�","�ּ�","��ȭ��ȣ"};//�÷���
		String cells[][]= {{"ȫ�浿","����","02-123-0987"},//������
				                  {"�׽�Ʈ","����","02-654-1234"},
				                  {"�ӽ�","��⵵","02-456-0987"}};
		table=new JTable(cells,header);//1.Data 2.column
		/*
		JScrollPane js=new JScrollPane(table);
		add(js);*/
		add(new JScrollPane(table));
		//---------------------------------
		setBounds(800,300,400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new JTableTest();
	}

}
