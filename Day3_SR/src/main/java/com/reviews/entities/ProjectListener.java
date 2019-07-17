package com.reviews.entities;

import javax.persistence.PostRemove;

public class ProjectListener {

	@PostRemove
	public void display(Project P) {
		System.out.println("Deleted");
	}
}
