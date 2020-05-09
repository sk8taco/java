package j200116;
//System.out.printf

public class Op6Cast2 {
	public static void main(String[] args) {
		int num1=20,num2=30;
		//형식) printf(출력양식,출력할대상자) -> %d 정수값, %c 문자, %s 문자열 %f 소수점
		System.out.printf("첫번째 숫자=%d, 두번째 숫자=%d\n",num1,num2);
		System.out.printf("두 숫자의 합 = %d",num1+num2);
		System.out.println();
		System.out.println('\n');
		System.out.println("첫번쨰 숫자="+num1+"두번째 숫자="+num2);
		
		// 형변환
		char ch='A';
		//--------------------------------
		System.out.printf("문자 %c의 유니코드값은 %d\n",ch,(int)ch);
		//--------------------------------
		System.out.println("ch=>"+ch);
		//---------------------------------
		int ch2 = ch; // char => int
		System.out.println(ch2);
		//----------------------------------
		int java = 90,jsp=85,oracle=70;
		int sum=java+jsp+oracle;
		System.out.printf("sum=%d입니다.\n",sum);
		System.out.println("sum="+sum+"입니다.");
		//평균
		int avg=sum/3;
		double avg2= (sum/3);
		double avg3=(double)sum/3;
		double avg4= (sum*100/3);
		System.out.println("avg="+avg);
		System.out.println("avg2="+avg2);
		System.out.println("avg3="+avg3);
		System.out.println("avg4="+avg4/100);
		
		//형식) %f -? %.소수점자리수f->%.2f
		System.out.printf("평균(avg5):%.2f",avg3);

		
	}
}
