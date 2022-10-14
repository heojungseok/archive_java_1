package Main;

public class Main {

	public static void main(String[] args) {

//		Account ac = new Account(1000,"123-123","gggg");

		DebitCard d = new DebitCard(1000, "000-111", "ddd", "1234-1234");

//		ac.deposit(1000);
//		ac.deposit(200);
//		
//		System.out.println("ac:"+ac.balance);

		d.deposit(5000);

//		d.withdraw(40);
//		d.withdraw(40);
		System.out.println("card:" + d.balance);
//		d.withdraw(100000);
		System.out.println(d.cardNo);
		System.out.println(d.ownerName);
//		System.out.println("card:" + d.balance);
		d.pay("1234-1234", 10000);
		d.pay("1234-12334", 10000);
		System.out.println("card:" + d.balance);
// commit
	}

}
