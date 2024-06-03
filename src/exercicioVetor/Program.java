package exercicioVetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vectR = new Room[11];
		
		
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt(); sc.nextLine();
		for(int i = 0; i < n; i++){
			System.out.printf("Rent #%d:%n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int j = sc.nextInt(); sc.nextLine();
			vectR[j] = new Room(name, email);
		}
		System.out.println();
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < vectR.length; i++) {
			if(vectR[i] != null) {
				System.out.println(i + ": " + vectR[i]);
			}

		}
		
		
		sc.close();

	}

}
