package controller;

import java.util.Scanner;

public class Esegui {

	public static void main(String[] args) {
		
		Metodi m = new Metodi();
		
		Scanner sc = new Scanner (System.in);
		
		int calcolatrice = sc.nextInt();
		m.calcolo(calcolatrice);
		
		
		
		

	}

}
