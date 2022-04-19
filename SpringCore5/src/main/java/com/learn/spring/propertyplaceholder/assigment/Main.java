package com.learn.spring.propertyplaceholder.assigment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/learn/spring/propertyplaceholder/assigment/config.xml");
		WsClient ws = (WsClient) ctx.getBean("wsclient");
		System.out.println(ws.toString());

	}

}
