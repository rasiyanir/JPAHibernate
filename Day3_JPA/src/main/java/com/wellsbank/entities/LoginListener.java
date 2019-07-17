package com.wellsbank.entities;

import javax.persistence.PostPersist;

public class LoginListener {

	@PostPersist
	public void initialize(Login l) {
		System.out.println("Entity is persisted");
	}
}
