package org.sudoinit5.mgray.springintegration.examples.demo3;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.jivesoftware.smack.Chat;
import org.springframework.integration.annotation.Header;
import org.springframework.integration.annotation.Payload;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.xmpp.XmppHeaders;
import org.springframework.stereotype.Component;


@Component
public class XmppServiceActivator {

	@ServiceActivator
	public void onIM (
	    @Header(XmppHeaders.CHAT ) Chat chat,
	    @Payload String txt
	) throws Exception {
		System.out.println(
	    	"Recieved message '"+ txt + "' from " + chat. getParticipant() 
		) ;
	}


	public static void main(String [] args )throws Exception {
	    new ClassPathXmlApplicationContext("demo3.xml").start() ;

		while(true )
		Thread.sleep( 1000 );


	}

}
