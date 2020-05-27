package controller;

import java.util.Scanner;

public class Metodi {

	Scanner sc= new Scanner(System.in);
	
	public void calcolo(int calcolatrice) {
		
		do {
			System.out.println("Scegli l'operazione da fare :");
			System.out.println("1: Addizione\n 2:Sottrazione\n 3:Moltiplicazione "
					+ "\n 4:Divisione\n exit=per uscire");
			
			if (calcolatrice == 1) {
				int a = sc.nextInt();
				int b =sc.nextInt();
				int c= a+b;
			}
			if (calcolatrice == 2) {
				int a = sc.nextInt();
				int b =sc.nextInt();
				int c= a-b;
		}
			if (calcolatrice == 3) {
				int a = sc.nextInt();
				int b =sc.nextInt();
				int c= a*b;
	}
			if (calcolatrice == 4) {
				int a = sc.nextInt();
				int b =sc.nextInt();
				int c= a/b;
	
	}
		
		}
		while (true);
	}
}

