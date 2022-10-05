package com.educacionit.Clase24;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.educacionit.entidades.User;
import com.educacionit.entidades.UserComparatorByEmail;

public class SortUserApp {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(2L, false, LocalDateTime.parse("2022-09-23T20:45:41"), "user2", "ABCD"));
		users.add(new User(1L, true, LocalDateTime.parse("1983-09-23T20:45:41"), "user1", "AABC"));

		System.out.println(users);
		Collections.sort(users);
		System.out.println(users);

		Collections.sort(users, new UserComparatorByEmail());
		System.out.println(users);

		Comparator<User> byCreationDateAsc = new Comparator<User>() {
			public int compare(User user1, User user2) {
				return user1.getCreationDate().compareTo(user2.getCreationDate());
			}
		};

		Collections.sort(users, byCreationDateAsc);
		System.out.println(users);
		// (parametros) -> returno;

		Comparator<User> byCreationDateDesc = (user1, user2) -> user2.getCreationDate()
				.compareTo(user1.getCreationDate());

		Collections.sort(users, byCreationDateDesc);
		System.out.println(users);

		Collections.sort(users, (user1, user2) -> user1.getKey().compareTo(user2.getKey()));
		System.out.println(users);
		
		
		
	}
}
