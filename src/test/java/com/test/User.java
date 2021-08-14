package com.test;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name="张无忌-九门提督-一品";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
