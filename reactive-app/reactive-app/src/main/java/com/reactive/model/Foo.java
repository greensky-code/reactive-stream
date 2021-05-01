package com.reactive.model;

import java.util.UUID;

public class Foo {
	private UUID id;
	private String name;
	private static int count=0;

	public Foo() {
		this.id = UUID.randomUUID();
		this.name = "test "+count++;
		toString();
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Foo [id=" + id + ", name=" + name + "]";
	}

}
