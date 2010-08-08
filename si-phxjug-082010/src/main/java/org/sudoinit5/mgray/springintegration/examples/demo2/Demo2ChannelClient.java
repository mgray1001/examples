package org.sudoinit5.mgray.springintegration.examples.demo2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.Message;
import org.springframework.integration.channel.AbstractMessageChannel;
import org.springframework.integration.core.MessageBuilder;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Demo2ChannelClient {
        
    @Value("#{files}") private AbstractMessageChannel channel;

    private MessagingTemplate messagingTemplate = new MessagingTemplate();

    public void startProcess(File file) throws Throwable {

        Message<File> mFile = MessageBuilder.withPayload(file).build() ;

    ///TODO    this.channel.send();


    }


}
