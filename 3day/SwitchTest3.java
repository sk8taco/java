package j200117;

public class SwitchTest3 {
	public static void main(String[] args) {
		System.out.println("조건식에서도 문자 사용이 가능");
		String day="10";
			
		switch(day) {
		
		case "10":
			System.out.println("10을 선택함");
			break;
			
		case "20": case "30": case "40": case "50": case "60":
			System.out.println("선택한 문자열은 20~60 범위에 있습니다");
		}
		System.out.println("switch 종료");
	}
}
