package com.educacionit.entidades;

import java.util.Comparator;

public class UserComparatorByEmail implements Comparator<User> {

	public int compare(User user1, User user2) {
		return user2.getEmail().compareTo(user1.getEmail());
	}

}
