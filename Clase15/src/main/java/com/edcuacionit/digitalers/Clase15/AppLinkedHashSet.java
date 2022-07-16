package com.edcuacionit.digitalers.Clase15;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppLinkedHashSet {
	public static void main(String[] args) {
		Set<String> nombres = new LinkedHashSet<>();

		nombres.add("Sol");
		nombres.add("Rafael");
		nombres.add("Octavio");
		nombres.add("Matias");
		nombres.add("Malena");

		System.out.println(nombres);
	}
}
