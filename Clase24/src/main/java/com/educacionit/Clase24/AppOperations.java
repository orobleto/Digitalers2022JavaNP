package com.educacionit.Clase24;

import com.educacionit.interfaces.Operations;
import com.educacionit.utilities.MathematicalOperations;

public class AppOperations {
	public static void main(String[] args) {

		// imperativo
		System.out.println(MathematicalOperations.add(5, 6));

		// declarativo -> =>

		Operations add = new Operations() {

			public int generic(int a, int b) {

				return 5;
			}
		};

		// lambda (parametros) -> returno;
		Operations subtrac = (int a, int b) -> a - b;

		System.out.println(add.generic(5, 8));

		System.out.println(subtrac.generic(8, 6));

		Operations divide = (int a, int b) -> {
			if (b == 0) {
				return 0;
			}
			return a / b;
		};

	}
}
