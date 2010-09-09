package org.sudoinit5.mgray.springintegration.examples.demo25;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.Date;

public class Main {
	public static void main (String [] args) throws Exception {

		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext( "demo25.xml")      ;

		SocialMediaPublisherService socialMediaPublisherService = applicationContext.getBean( SocialMediaPublisherService.class ) ;
		
	 	socialMediaPublisherService.sendXMPPMessage( "mario.gray@gmail.com", "hello world at " + new Date()) ;

		socialMediaPublisherService.tweet( "Hello, world!");


		while( true)
			Thread.sleep( 1000 );





	}
}
