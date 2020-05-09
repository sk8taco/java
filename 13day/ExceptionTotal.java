package j200205;
/*
 * 예외처리 전체과정 소개 및 주의할점
 */
public class ExceptionTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("매개변수를 전달받아서 처리(동적)");
		try {//에러가 발생가능성이 있는 구문을 범위로 지정
			int a=Integer.parseInt(args[0]);//"9"->9
			int b=Integer.parseInt(args[1]);//"a"->0
			
			System.out.println("a=>"+a+",b=>"+b);
			System.out.println("a를 b로 나눈 몫=>"+(a/b));
		} catch (ArithmeticException e) { //수식오류 9/0으로 나눈경우
			System.out.println(e);//e.toString()
			System.out.println("9를 0으로 나눌 수가 없습니다.");
		} catch(IndexOutOfBoundsException | NumberFormatException e) {//배열의 첨자가 문제발생(한개만 입력한경우)
			System.out.println(e);
			System.out.println("두개를 반드시 입력하거나 숫자만 입력해야 합니다.");
		}/* catch(NumberFormatException e) { //"9"=>9   "a"->(X) 숫자로 변환X
			System.out.println(e);
			System.out.println("입력은 반드시 문자가 아닌 숫자로 입력해야 합니다.");
		} */catch(Exception e) {//자식클래스에서 발생된 예외처리는 부모클래스가 담당
			System.out.println(e.toString());
			System.out.println("위의 예외처리외의 나머지 모두를 처리합니다.");
		}finally {
			System.out.println("에러발생 유무와 상관없이 반드시 처리해야할 구문이 필요한경우 사용");
		    //메모리해제->con.close(),rs.close();
		}
	}

}




