package com.educacionit.clase25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStreamObjectBasic {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sol", "Matias", "Arai", "Malena", "Celina", "Ivanna");
		match(names);
		// transformar
		map(names);
		// filtrar
		filter(names);
		// compactar - reducir - transformar en un solo elemento
		reduce(names);

		System.out.println("***************reduce - complejo***************");
		String cadenaFinal = names.stream().filter(e -> e.contains("e")).map(e -> e.toUpperCase()).reduce("",
				(e1, e2) -> e1.concat(e2));
		System.out.println(cadenaFinal);

		Integer lonTotal = names.stream().filter(e -> e.endsWith("a")).map(e -> e.length()).reduce(0,
				(e1, e2) -> e1 + e2);
		System.out.println(lonTotal);

		String cadenaFinal2 = names.stream().filter(e -> e.endsWith("a")).map(e -> e.toUpperCase())
				.collect(Collectors.joining(","));
		System.out.println(cadenaFinal2);

		Stream<String> stream1 = names.stream().filter(e -> e.endsWith("a"));

		stream1.forEach(e -> System.out.println(e));

	}

	private static void reduce(List<String> list) {
		System.out.println("***************reduce***************");
		System.out.println(reduceString(list));
		// funcional

		String cadena = list.stream().reduce("?", (name1, name2) -> name1.concat(name2));
		System.out.println(cadena);
	}

	// metodo tradicional o imperativo - el como
	private static String reduceString(List<String> list) {
		StringBuffer names = new StringBuffer("-");
		for (String name : list) {
			names.append(name);
		}
		return names.toString();
	}

	private static void filter(List<String> list) {
		System.out.println("***************filter***************");
		// tradicional
		System.out.println(filterOfLetterA(list));

		// Funcional

		List<String> aux = list.stream().filter(name -> name.contains("e")).collect(Collectors.toList());
		System.out.println(aux);
	}

	// metodo tradicional o imperativo - el como
	private static List<String> filterOfLetterA(List<String> list) {
		List<String> aux = new ArrayList<>(list.size());
		for (String name : list) {
			if (name.contains("a")) {
				aux.add(name);
			}
		}
		return aux;
	}

	private static void map(List<String> list) {
		System.out.println("***************map***************");
		System.out.println(list);
		System.out.println(transform(list));
		System.out.println(list);

		Stream<String> initialNames = list.stream().map((name) -> String.valueOf(name.charAt(1)));

		System.out.println(initialNames.collect(Collectors.toList()));

		List<Integer> lon = list.stream().map(e -> e.length()).collect(Collectors.toList());
		System.out.println(lon);

		System.out.println(list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()));

	}

	// metodo tradicional o imperativo - el como
	private static List<String> transform(List<String> list) {
		List<String> aux = new ArrayList<>(list.size());

		for (String name : list) {
			aux.add(String.valueOf(name.charAt(0)));
		}
		return aux;
	}

	private static void match(List<String> list) {
		System.out.println("***************match***************");
		System.out.println(containsA(list));

		// metodo funcional y declarativo - el que
		boolean containsAStreams = list.stream().allMatch(name -> name.contains("a"));

		System.out.println(containsAStreams);

		System.out.println(list.stream().anyMatch(e -> e.contains("h")));
	}

	// metodo tradicional o imperativo - el como
	private static boolean containsA(List<String> list) {

		for (String name : list) {
			if (!name.contains("a")) {
				return false;
			}
		}
		return true;
	}
}
