package com.educacionit.entities;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class User extends GenericEntity {
	@NonNull
	private String email;
	@NonNull
	private String key;
	private Boolean active;
	private Set<Role> roles;

	public User(Long id, LocalDateTime creationDate, @NonNull String email, @NonNull String key, Boolean active,
			Set<Role> roles) {
		super(id, creationDate);
		this.email = email;
		this.key = key;
		this.active = active;
		this.roles = roles;
	}

	public int orderByIdDesc(User user) {
		return (int) (user.getId() - this.getId());
	}

}
