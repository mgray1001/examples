package org.sudoinit5.mgray.springintegration.examples.demo26;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.Header;
import org.springframework.integration.annotation.Payload;
import org.springframework.integration.xmpp.XmppHeaders;
import org.springframework.stereotype.Component;

@Component
public interface GatewayMediaService {
	
	@Gateway(requestChannel = "outboundIM" )
	void sendIM(@Header(XmppHeaders.CHAT_TO_USER) String xmppHandle , @Payload String body)  ;

   // TODO write Message sendManual
    

}
