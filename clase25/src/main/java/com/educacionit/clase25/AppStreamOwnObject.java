package com.educacionit.clase25;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.educacionit.entities.Role;
import com.educacionit.entities.User;

public class AppStreamOwnObject {
	public static void main(String[] args) {
		Set<Role> roles = Set.of(new Role(1L, LocalDateTime.now(), "ADMIN"), new Role(2L, LocalDateTime.now(), "SUP"));

		List<User> users = new ArrayList<>();
		users.add(new User(1l, LocalDateTime.now(), "user1@gmail.com", "1234", true, roles));
		users.add(new User(2l, LocalDateTime.now(), "user2@gmail.com", "1234", false, roles));
		users.add(new User(3l, LocalDateTime.now(), "user3@gmail.com", "1234", true, roles));
		users.add(new User(4l, LocalDateTime.now(), "user4@gmail.com", "1234", true, roles));

		Stream<User> usersStream = users.stream();
		// System.out.println(usersStream.count());
		// operaciones intermedias filter y el map no pueden ejecutarse en distintas
		// lineas

		// las operacionles finales si count sum
		// usersStream.filter(e -> e.getActive());

		System.out.println(usersStream.filter(e -> e.getActive()).count());

		List<String> emails = users.stream().map(e -> e.getEmail()).collect(Collectors.toList());

		System.out.println(users.stream().map(e -> e.getEmail()).collect(Collectors.joining(",", "<", ">")));

	}
}
