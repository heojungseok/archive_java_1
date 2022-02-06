package Main;

public class DebitCard extends Account {
	
	String cardNo;
	/** 부모 생성자가 있을 경우 자식 생성자에서 무조건 부모 생성자를 호출해야함 **/
	public DebitCard(int balance, String accountNo, String ownerName, String cardNo) {
		super(balance, accountNo, ownerName); // 부모 생성자

		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) {
		if(cardNo.equals(this.cardNo) && balance >= amount) {
			return withdraw(amount);
		}else {
			System.out.println("payment error");
			return 0;
		}
	}
	
	@Override
	void aa() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 오버라이드
	 * 상속받은 메소드 수정해서 쓰기
	 */
	void deposit(int amount) {
		super.deposit(amount); //<- 부모 메소드 호출
		System.out.println("=======");
		balance += amount*2;
	}

}
