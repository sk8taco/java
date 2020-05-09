package j200204;

import java.awt.*;//�׷���
import javax.swing.*;//����

//����� �޾Ƽ� �ۼ�
public class BorderTest extends JFrame {

	//������ų ������Ʈ�� ��������� ����
	JButton b1,b2,b3,b4,b5;
	//�����ڿ��� ȭ��������� �ϴ°��� �ξ�����.
	public BorderTest(String str) {
		 setTitle(str);//super(str);
		 setBounds(300,300,400,300);//x,y,w,h->â�� ��ġ�� ũ�⸦ ����
		 //â�� ������ �ο�->Color�� ��������� �̿�
		 /*
		 Color c=new Color(233,127,97);//r,g,b
		 this.getContentPane().setBackground(c);
		 */
		 //������ų ������Ʈ�� ����
		 b1=new JButton("����1");
		 b2=new JButton("����2");
		 b3=new JButton("����3");
		 b4=new JButton("����4");
		 b5=new JButton("����5");
		 //â��ü��.add(������ų ������Ʈ��,��ġ(BorderLayout.��ġ)
		 /* (1)BorderLayout(��,��,��,��,��� ��ġ���)
		 this.getContentPane().add(b1,BorderLayout.WEST);//"West"
		 this.add(b2,"East");//������
		 this.add(b3,"Center");
		 this.add(b4,"North");
		 this.add(b5,"South");
		 */
		 /* (2) FlowLayout->��->���������� ��ġ��Ű�� ���
		 FlowLayout fl=new FlowLayout();
		 this.getContentPane().setLayout(fl);//flowLayout���� ��ġ�����ڸ� ����
		 */
		 this.getContentPane().setLayout(new GridLayout(3,2,5,5));//��,��,hgap,vgap
		 add(b1); add(b2); add(b3); add(b4); add(b5);
		 
		 this.getContentPane().setBackground(new Color(215,111,241));
		 //this.getContentPane().setBackground(Color.red);
		 //��ġ�����ڸ� ����->getContentPane().setLayout(��ġ������ ��ü����)
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//System.exit(0)
		 setVisible(true);//->show()(X)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //BorderTest bt=new BorderTest("��ġ������ ����");
		    new BorderTest("��ġ������ ����");//�տ� ��ü���� ����->�͸�ü
	}
}



