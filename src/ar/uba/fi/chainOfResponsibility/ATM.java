package ar.uba.fi.chainOfResponsibility;

import java.util.Scanner;

public class ATM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DispenseChain c100 = new Dollar100Dispenser();
		DispenseChain c50 = new Dollar50Dispenser();
		DispenseChain c20 = new Dollar20Dispenser();
		DispenseChain c10 = new Dollar10Dispenser();
		c100.setNextChain(c50);
		c50.setNextChain(c20);
		c20.setNextChain(c10);
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				input.close();
				return;
			}
			// process the request
			c100.dispense(new Currency(amount));
			
		}
	}

}
