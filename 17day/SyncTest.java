package j200211;

//급여통장(공유데이터)->ATM(Thread 작동)
class ATM implements Runnable{
	
	//급여계좌 금액
	private long money=10000;
	
	@Override
	public void run() { //공과금->자동이체,보험료,대출이자
		// TODO Auto-generated method stub
		//형식) synchronized(공유할 데이터){처리해야할 구문;}//DB
		synchronized(this) { //atm(자기 클래스객체명은 X)
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(1000);//1초동안 멈춘뒤에 실행
				}catch(Exception e) {}
				if(getMoney()<=0)
					break;//0원 잔액이 없기에
				withDraw(2000);
			}
		}//syn~
	}
	//돈을 인출시켜주는 메서드->수정목적->매개변수 O, 반환값 X
	public void withDraw(long howmuch) {
		//양수인 경우만 돈을 인출
		if(getMoney()>0) {//if(money>0) {
			money-=howmuch;//money=money-howmuch;
			System.out.println(Thread.currentThread().getName()+","+getMoney());
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	//잔액을 조회=>저장된 데이터를 꺼내서 출력=>반환형이 존재,매개변수 X
	public long getMoney() {
		return this.money;
	}
}
public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ATM atm=new ATM();
         Thread t1=new Thread(atm,"보험금");//runnable객체명,Thread명
         Thread t2=new Thread(atm,"공과금");
         t1.start(); t2.start();//->run()->withDraw()
	}

}



