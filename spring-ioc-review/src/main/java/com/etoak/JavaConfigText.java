package com.etoak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.etoak.action.UserAction;
import com.etoak.config.UserConfig;

public class JavaConfigText {
	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext(UserConfig.class);
		UserAction userAction = ioc.getBean(UserAction.class);
		System.out.println(userAction.getById(10));
	}
}
