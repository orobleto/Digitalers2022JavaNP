package com.educacionit.Clase24;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.educacionit.entidades.User;

public class SortUserApp3 {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		users.add(new User(1L, true, LocalDateTime.parse("2022-10-23T20:45:41"), "user3", "ABCD1"));
		users.add(new User(2L, true, LocalDateTime.parse("2022-08-23T20:45:41"), "user2", "ABCD1"));
		users.add(new User(3L, true, LocalDateTime.parse("2022-07-23T20:45:41"), "user3", "ABCD2"));
		users.add(new User(4L, true, LocalDateTime.parse("2022-08-23T20:45:41"), "user3", "ABCD3"));
		users.add(new User(5L, true, LocalDateTime.parse("2022-06-23T20:45:41"), "user5", "ABCD2"));
		users.add(new User(6L, true, LocalDateTime.parse("2022-09-23T20:45:41"), "user6", "ABCD4"));

		// Consumer<User> printUser = (user) -> System.out.println(user);
		users.forEach((u) -> System.out.println(u));
		System.out.println("*********************");
		users.forEach((user) -> print(user));

		System.out.println("***********------------**********");

		users.forEach(SortUserApp3::print);
		System.out.println("***********------------**********");
		
		users.forEach(System.out::println);
	}

	private static void print(User user) {
		System.out.println(user.getEmail() + " - " + user.getKey());
	}
}
