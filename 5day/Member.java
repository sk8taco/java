package j200121;

public class Member {
	int memberNo=0; 	// 회원번호 - primary key
	String memberID;
	String password; // memberID와 연계
	String memberName; // 회원이름
	int memberAge;
	String Address;	// 집주소
	String p_no1; 		// 전화번호 1
	String p_no2;		// 전화번호 2
	boolean skateExp  = false; // 스케이트경험
	long memberPoint=0;
	
	
Member(){
	memberNo++;
}
		void searchMember(int memberNo) { //회원정보 조회 메소드		
		System.out.println("====회원정보=====");
		System.out.println("회원번호 ="+memberNo);
		System.out.println("회원ID ="+memberID);
		System.out.println("회원이름 ="+memberName);
		System.out.println("회원나이 ="+memberAge);
		System.out.println("회원주소="+Address);
		System.out.println("회원전화번호1="+p_no1);
		System.out.println("회원전화번호2 ="+p_no2);
		String Exp;
		if(skateExp) {
			Exp = "유";
		}else {
			Exp ="무";
		}
		System.out.println("스케이트 경험 유/무="+Exp);
		System.out.println("회원 포인트="+memberPoint);
	}
	void pointUp(long point) {
		memberPoint+=point;
		System.out.println("모임 참석으로 포인트가 적립되었습니다.");
		System.out.println("현재 포인트는 "+memberPoint+"입니다");
	}
	void pointDown(long point) {
		memberPoint-=point;
		System.out.println("모임 미참석으로 포인트가 깎였습니다.");
		System.out.println("현재 포인트는 "+memberPoint+"입니다");
	}	
}
