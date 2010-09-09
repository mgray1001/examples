package org.sudoinit5.mgray.springintegration.examples.demo2;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	public static void main(String [] args )throws Exception {

		ApplicationContext ac = new ClassPathXmlApplicationContext("demo2.xml");

		SimpleSendingClient simpleSendingClient = ac.getBean( SimpleSendingClient.class);
		simpleSendingClient.talkToSpringIntegration( "hello, world!");
		
	}
}
