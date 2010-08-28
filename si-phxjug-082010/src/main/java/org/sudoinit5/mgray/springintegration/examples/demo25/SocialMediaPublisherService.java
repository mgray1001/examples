package org.sudoinit5.mgray.springintegration.examples.demo25;

import org.springframework.integration.annotation.Header;
import org.springframework.integration.annotation.Payload;
import org.springframework.integration.aop.Publisher;
import org.springframework.integration.twitter.TwitterHeaders;
import org.springframework.integration.xmpp.XmppHeaders;
import org.springframework.stereotype.Component;


@Component
public class SocialMediaPublisherService {

	@Publisher(channel = "outboundTwitterDirectMessages")
	public String sendTwitterDirectMessage(
			@Header(TwitterHeaders.TWITTER_DM_TARGET_USER_ID) String userToDirectMessage,
			@Payload String status ){
	  return status ;
	}

	@Publisher(channel = "outboundIM")
	public void  sendXMPPMessage( @Header(XmppHeaders.CHAT_TO_USER) String xmppUser , @Payload String messageToSend )  {

	}
}
