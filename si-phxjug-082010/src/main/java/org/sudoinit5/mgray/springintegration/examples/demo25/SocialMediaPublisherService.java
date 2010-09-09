package org.sudoinit5.mgray.springintegration.examples.demo25;

import org.springframework.integration.annotation.Header;
import org.springframework.integration.annotation.Payload;
import org.springframework.integration.aop.Publisher;
import org.springframework.integration.xmpp.XmppHeaders;
import org.springframework.stereotype.Component;


@Component
public class SocialMediaPublisherService {

	@Publisher( channel = "outboundTwitterUpdates")
	public String tweet ( @Payload String status ){ return status;}

	@Publisher(channel = "outboundIM")
	public String  sendXMPPMessage( @Header(XmppHeaders.CHAT_TO_USER) String xmppUser , @Payload String messageToSend )  {    return messageToSend;
 	}
}
