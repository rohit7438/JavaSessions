package practiceJava;

public class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double deposit) {
		this.balance = this.balance + deposit;
	}

	public void withdraw(double withdraw) {
		if (balance>0) {
			this.balance = this.balance - withdraw;
			System.out.println(this.balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	
	public static void main(String[]args) {
		BankAccount obj = new BankAccount("13212321",0);
//		obj.deposit(30);
		obj.withdraw(10);
	
		
	}
	
	

}
