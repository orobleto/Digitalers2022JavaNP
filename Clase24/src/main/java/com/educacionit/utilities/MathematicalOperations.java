package com.educacionit.utilities;

public final class MathematicalOperations {
	private MathematicalOperations() {
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtrac(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a - b;
	}

	public static int divide(int a, int b) { //=> ->
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
}
