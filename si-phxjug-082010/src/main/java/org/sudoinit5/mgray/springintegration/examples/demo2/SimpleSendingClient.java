package org.sudoinit5.mgray.springintegration.examples.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.core.MessageBuilder;
import org.springframework.integration.core.MessageChannel;
import org.springframework.integration.core.MessagingTemplate;


/**
 * Demonstrates sending messsages explicitly
 *
 */ 
public class SimpleSendingClient {

	@Value("#{inboundChannel}") private MessageChannel channel  ;

	private MessagingTemplate messagingTemplate  = new MessagingTemplate() ;

	public void talkToSpringIntegration( String msg ){
		this.messagingTemplate.send( this.channel , MessageBuilder.withPayload( msg).build()) ;
	}
}
