package com.learn.spring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) ctx.getBean("dao");
		System.out.println(dao.toString());

	}

}
