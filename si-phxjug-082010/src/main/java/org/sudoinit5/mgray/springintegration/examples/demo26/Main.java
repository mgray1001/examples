package org.sudoinit5.mgray.springintegration.examples.demo26;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String [] args) throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext( "demo26.xml") ;

		GatewayMediaService gatewayMediaService = classPathXmlApplicationContext.getBean(GatewayMediaService.class) ;

		gatewayMediaService.sendIM( "mario.gray@gmail.com" , "Hello, all!");

		 

		while(true ) Thread.sleep(1000 );
	}
}
