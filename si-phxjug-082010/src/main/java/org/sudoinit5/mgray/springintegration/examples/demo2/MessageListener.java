package org.sudoinit5.mgray.springintegration.examples.demo2;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;


/**
 * Did you forget?
 *   - hint = @ServiceActivator
 */
public class MessageListener {
	@ServiceActivator
    public void onNewMessage( String msg ) {
		System.out.println( "Received message " + msg ) ;
	}
}
