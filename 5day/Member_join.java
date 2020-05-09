package j200121;

public class Member_join {

	public static void main(String[] args) {
		Member m01 = new Member();
		m01.memberName="¹ÚÁ¾Çõ";
		m01.Address="¼­¿ï½Ã µµºÀ±¸";
		m01.memberAge=33;
		m01.memberID="Parksk8";
		m01.p_no1="02-5421-3215";
		m01.p_no2="010-3253-6443";
		
		m01.pointUp(5000);
		m01.pointDown(2000);
		
		m01.searchMember(m01.memberNo);
				
	}

}
