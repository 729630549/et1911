package com.etoak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.action.UserAction;

public class XmlTest {
 public static void main(String[] args) {
	 ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
	 UserAction userAction = (UserAction)ioc.getBean("userAction");
	 System.out.println(userAction.getById(1));
 }
}
