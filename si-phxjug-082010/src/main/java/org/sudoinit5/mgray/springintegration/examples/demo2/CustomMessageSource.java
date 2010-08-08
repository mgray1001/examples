package org.sudoinit5.mgray.springintegration.examples.demo2;

import org.springframework.integration.Message;
import org.springframework.integration.core.MessageBuilder;
import org.springframework.integration.core.MessageSource;
import org.springframework.stereotype.Component;


@Component
public class CustomMessageSource implements MessageSource<String> {
    public Message<String> receive() {
        return MessageBuilder.withPayload(Double.toString(Math.random() * 10000)).build();
    }
}
