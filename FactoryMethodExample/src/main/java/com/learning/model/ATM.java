package com.learning.model;

public class ATM {
	
	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void printAccountBalance(String accNumber) {
		printer.printAccountBalance(accNumber);
	}

}
