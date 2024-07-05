package dev.luyee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("dev.luyee");
		System.out.println(applicationContext.getBean(User.class));
	}
}