package j200210;

public class GenericEx<T> {  //�迭�� ���� ����->��¸���=>GenericExMain.java

	//�ڷ����� �ٸ����̰� �迭�� ���� ������ �������� ����� �������
	/* ���ʸ�Ŭ����=>Ư�� �ڷ����� ���� �Է��� �޾Ƽ� ����,��ȸ,���,����� ����
	 * ����)  class Ŭ������<T>
	 *         �������,�޼����� �Ű��������� ���ʸ��� �ο��� ��  �� �ִ�.
	 * 
	 */
	  T v[];//String v[]; Double v2[]; Integer v3[];
	
	//1.�迭�� ���� �����ų ���� �޼���->Setter(�Ű����� O, ��ȯ��X)
	public void set(T n[]) { //String,Double,Integer,,,
		v=n;//this.v=v;
	}
	/*
	public void set(Double n[]) { //�����ε�->���� �޼����ε� ���� �ٸ��� �νĽ�Ű�� ���
		v2=n;//this.v=v;
	}
	public void set(Integer n[]) { 
		v3=n;//this.v=v;
	}*/
	
	//2.�迭�� ���� �����ͼ� ȭ�鿡 ���(�ܼ�,�ݺ�)=>��������ڷ��� getXXx() or ��¸���
	public void print() {
		for(T s:v)//for(String s:v)
			System.out.println(s);
	}
}
