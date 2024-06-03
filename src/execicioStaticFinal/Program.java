package execicioStaticFinal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.qntDollar = sc.nextDouble();
		System.out.printf("Amout to be paid in reias = %.2f", CurrencyConverter.calcReais());
		
		
		
		
		sc.close();
	}
}