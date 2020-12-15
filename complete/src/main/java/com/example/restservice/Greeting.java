package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = 10;
		this.content = "MUkesh is Great";
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
