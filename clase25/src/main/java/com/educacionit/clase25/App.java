package com.educacionit.clase25;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import com.educacionit.entities.Role;
import com.educacionit.entities.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Set<Role> roles = Set.of(new Role(1L, LocalDateTime.now(), "ADMIN"), new Role(2L, LocalDateTime.now(), "SUP"));

		List<User> users = new ArrayList<>();
		users.add(new User(1l, LocalDateTime.now(), "user1@gmail.com", "1234", true, roles));
		users.add(new User(2l, LocalDateTime.now(), "user2@gmail.com", "1234", true, roles));
		users.add(new User(3l, LocalDateTime.now(), "user3@gmail.com", "1234", true, roles));
		users.add(new User(4l, LocalDateTime.now(), "user4@gmail.com", "1234", true, roles));

		// declarativa es el que va a hacer y no el como

		System.out.println("***********Declarativa***************");
		users.forEach(user -> imprimirEmail(users));

		System.out.println("***********Declarativa - Referencia Metodo 1***************");
		users.forEach(App::imprimirEmail);

		System.out.println("***********Declarativa - Referencia Metodo 2***************");
		users.forEach(App::imprimirEmail2);
		
		System.out.println("***********Imperativa***************");
		// imperativa el como
		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void imprimirEmail(Object object) {
		System.out.println("El objeto: -> " + object);
	}

	private static <E> void imprimirEmail2(E e) {
		System.out.println("Objeto desde Metodo generico -> " + e);
	}
}
