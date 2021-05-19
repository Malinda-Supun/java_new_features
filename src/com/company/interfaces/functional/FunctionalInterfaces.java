package com.company.interfaces.functional;

// Functional Interfaces
public class FunctionalInterfaces {
	// Functional interface
	@FunctionalInterface
	interface Multiplier {
		int multiply(int i, int j);
	};

	public void callMultiplier(Multiplier multiplier){
		System.out.println(multiplier.multiply(5,6));
	}
	// Lambda expression
	public static void main(String[] args) {
		Multiplier multiplierLambda = (p, q) -> p*q;

		FunctionalInterfaces client = new FunctionalInterfaces();

		client.callMultiplier(multiplierLambda);


	}

}
