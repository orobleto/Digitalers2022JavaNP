package com.educacionit.Clase24;

import java.time.LocalDateTime;

import com.educacionit.entidades.User;
import com.educacionit.jdbc.GenericDAO;
import com.educacionit.jdbc.implementations.UserImplementation;

public class App {
	public static void main(String[] args) {
		User user = new User(1L, true, LocalDateTime.now(), "user1", "1234");
		UserImplementation userImplementation = new UserImplementation();
		userImplementation.save(user);
		user.print();

		userImplementation.print();

		GenericDAO.getUserConnection();
	}
}
