package com.educacionit.clase25;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.educacionit.entities.Role;
import com.educacionit.entities.User;

public class App2 {
	public static void main(String[] args) {
		Set<Role> roles = Set.of(new Role(1L, LocalDateTime.now(), "ADMIN"), new Role(2L, LocalDateTime.now(), "SUP"));

		List<User> users = new ArrayList<>();
		users.add(new User(1l, LocalDateTime.now(), "user1@gmail.com", "1234", true, roles));
		users.add(new User(2l, LocalDateTime.now(), "user2@gmail.com", "1234", true, roles));
		users.add(new User(3l, LocalDateTime.now(), "user3@gmail.com", "1234", true, roles));
		users.add(new User(4l, LocalDateTime.now(), "user4@gmail.com", "1234", true, roles));

		users.forEach(e -> System.out.println(e.getId()));

		users.sort(User::orderByIdDesc);
		System.out.println("********************************");
		users.forEach(e -> System.out.println(e.getId()));

	}
}
