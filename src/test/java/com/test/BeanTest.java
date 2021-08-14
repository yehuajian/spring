package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {


	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-beans.xml");
		User user=ac.getBean(User.class);
		System.out.print(user.getName());

	}

}
