package j200116;
// ���������� 2��° ����

public class Op2 {
	public static void main(String[] args) {
		byte b1=5;
		short s=-4;
		int i=8;
		
		System.out.println("b1="+b1);
		System.out.println("-s="+(-s)); //-(-4)
		System.out.println("i="+i);//8
		System.out.println("++i="+(++i));//9
		/*
		 * i = i+1	���Կ����� = �� ������ �켱������ ������ 
		 */
		System.out.println("i++=>"+(i++)); //9
		System.out.println("i="+i);
		/*
		 * i = i+1 -> i = 9+1 ----> 10
		 */
		System.out.println("--i="+(--i));
		/*
		 * i=i-1
		 */
		System.out.println("i--="+(i--));
		System.out.println("i="+i);
		
	}
}
