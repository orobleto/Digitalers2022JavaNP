package com.educacionit.entidades;

import java.time.LocalDateTime;

public abstract class GenericEntity implements Comparable<User> {
	protected Long id;
	protected Boolean active;
	protected LocalDateTime creationDate;

	public GenericEntity() {
		super();
	}

	public GenericEntity(Long id, Boolean active, LocalDateTime creationDate) {
		super();
		this.id = id;
		this.active = active;
		this.creationDate = creationDate;
	}

	public String toString() {
		return "GenericEntity [id=" + id + ", active=" + active + ", creationDate=" + creationDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public abstract void print();

}
