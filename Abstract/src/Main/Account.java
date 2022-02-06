package Main;

public  abstract class Account {
	
	int balance ;
	String accountNo ;
	String ownerName ;
	
	public Account(int balance, String accountNo, String ownerName) {
		this.balance = balance;
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	
	abstract void aa();
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("payment error");
			return 0;
		}else {
			balance -= amount;
			return amount;
		}
	}

}
