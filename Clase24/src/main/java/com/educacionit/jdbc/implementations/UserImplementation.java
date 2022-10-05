package com.educacionit.jdbc.implementations;

import java.util.List;

import com.educacionit.entidades.User;
import com.educacionit.jdbc.DAO;

public class UserImplementation implements DAO<User> {

	public User findById(Long id) {
		System.out.println("findById " + id);
		return null;
	}

	public Boolean save(User user) {
		System.out.println("save - " + user);
		return null;
	}

	public Boolean delete(User user) {
		System.out.println("delete - " + user);
		return null;
	}

	public List<User> findAll() {
		System.out.println("findAll");
		return null;
	}

}
