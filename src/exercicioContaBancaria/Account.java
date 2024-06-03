package exercicioContaBancaria;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double amount) {
		this.number = number;
		this.holder = holder;
		deposit(amount);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount){
		balance -= amount + 5.00;
	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + String.format(", Balance: $ %.2f", balance) ;
	}
	
	
	
	
}
