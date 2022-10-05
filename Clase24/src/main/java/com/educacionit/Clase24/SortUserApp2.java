package com.educacionit.Clase24;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.educacionit.entidades.User;

public class SortUserApp2 {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		users.add(new User(1L, true, LocalDateTime.parse("2022-10-23T20:45:41"), "user3", "ABCD1"));
		users.add(new User(2L, true, LocalDateTime.parse("2022-08-23T20:45:41"), "user2", "ABCD1"));
		users.add(new User(3L, true, LocalDateTime.parse("2022-07-23T20:45:41"), "user3", "ABCD2"));
		users.add(new User(4L, true, LocalDateTime.parse("2022-08-23T20:45:41"), "user3", "ABCD3"));
		users.add(new User(5L, true, LocalDateTime.parse("2022-06-23T20:45:41"), "user5", "ABCD2"));
		users.add(new User(6L, true, LocalDateTime.parse("2022-09-23T20:45:41"), "user6", "ABCD4"));

		/*
		 * Comparator<User> byKeyAndCreationDate = (user1, user2) -> {
		 * 
		 * int compareKey = user1.getKey().compareTo(user2.getKey()); if (compareKey ==
		 * 0) { return user2.getEmail().compareTo(user1.getEmail()); } return
		 * compareKey;
		 * 
		 * };
		 */

		for (User user : users) {
			System.out.println(user);
		}

		Comparator<User> byKey = (u1, u2) -> u1.getKey().compareTo(u2.getKey());

		Comparator<User> byEmail = (u1, u2) -> u2.getEmail().compareTo(u1.getEmail());

		System.out.println("*****************");
		users.sort(byKey.thenComparing(byEmail));
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("*****************");
		users.sort(byEmail.thenComparing(byKey));
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("*****************");
		users.sort(byEmail.thenComparing((u1, u2) -> u1.getCreationDate().compareTo(u2.getCreationDate())));

		for (User user : users) {
			System.out.println(user);
		}
		
		users.sort(byEmail);
		System.out.println("*****************");
		for (User user : users) {
			System.out.println(user);
		}
		
		users.sort(byEmail.reversed());
		System.out.println("*****************");
		for (User user : users) {
			System.out.println(user);
		}

	}

}
