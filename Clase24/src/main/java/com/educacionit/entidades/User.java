package com.educacionit.entidades;

import java.time.LocalDateTime;

public class User extends GenericEntity {
	private String email;
	private String key;

	public User() {
		super();
	}

	public User(Long id, Boolean active, LocalDateTime creationDate, String email, String key) {
		super(id, active, creationDate);
		this.email = email;
		this.key = key;
	}

	public String toString() {
		return "User [id=" + id + ", active=" + active + ", creationDate=" + creationDate + ", email=" + email
				+ ", key=" + key + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void print() {
		System.out.println("print - " + this);
	}

	// ordenamiento natural
	public int compareTo(User user) {
		return (int) (this.id - user.id);
	}

}
