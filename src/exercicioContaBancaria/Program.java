package exercicioContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account acc;
		double amount;
		System.out.print("Enter account number: ");
		int number = sc.nextInt(); sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char op = sc.next().charAt(0);
		if(op == 'y') {
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			acc = new Account(number, holder, amount);
		} else {
			acc = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		acc.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.println(acc);
		
		

		sc.close();

	}
}
