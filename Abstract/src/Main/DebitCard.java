package Main;

public class DebitCard extends Account {
	
	String cardNo;
	/** �θ� �����ڰ� ���� ��� �ڽ� �����ڿ��� ������ �θ� �����ڸ� ȣ���ؾ��� **/
	public DebitCard(int balance, String accountNo, String ownerName, String cardNo) {
		super(balance, accountNo, ownerName); // �θ� ������

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
	 * �������̵�
	 * ��ӹ��� �޼ҵ� �����ؼ� ����
	 */
	void deposit(int amount) {
		super.deposit(amount); //<- �θ� �޼ҵ� ȣ��
		System.out.println("=======");
		balance += amount*2;
	}

}
