package com.company.interfaces.functional;

import com.company.domain.Trade;

// Functional Interfaces
public class FunctionalInterfaces3 {
	// Functional interface
	interface ITrade {
		void set(Trade t, String status);
	};
	// Lambda expression
	
	
	public static void main(String[] args) {
		FunctionalInterfaces3 client = new FunctionalInterfaces3();
	}

}
