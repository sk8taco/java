package j200205;

//caller method--->worker method=>에러유발 발생
public class ExceptionTest2 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		/*
        int i=0;//첨자
        String greetings[]= {"객체형변환","예외처리","예외처리 방법"};
        while(i<4) {
        	System.out.println(greetings[i]);
        	i++;
        }//while
        */
		try {
			ExceptionTest2 et=new ExceptionTest2();
			et.go();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 첨자가 벗어난 인덱스번호가 있습니다.잘 찾아보세요");
			System.out.println(e.getMessage());//간단한 에러메세지
			System.out.println(e);//e.toString()호출=>중간정보 제공
			e.printStackTrace();//아주 자세하게 에러나온 이유를 설명
		}
		System.out.println("예외처리 종료!!");
	}
	
	//1.부탁하는 방법 메서드명() throws 발생한 예외처리클래스명
	public void go() throws ArrayIndexOutOfBoundsException{
		int i=0;//첨자
        String greetings[]= {"객체형변환","예외처리","예외처리 방법"};
        while(i<4) {
        	System.out.println(greetings[i]);
        	i++;
        }
	}
	
}
