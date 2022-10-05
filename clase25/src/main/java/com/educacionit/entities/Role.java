package com.educacionit.entities;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Role extends GenericEntity {
	private String description;

	public Role(Long id, LocalDateTime creationDate, String description) {
		super(id, creationDate);
		this.description = description;
	}

}
