package org.sudoinit5.mgray.springintegration.examples.error;

import org.apache.commons.httpclient.util.ExceptionUtil;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.integration.Message;
import org.springframework.integration.MessageHandlingException;
import org.springframework.integration.MessageHeaders;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.core.MessageBuilder;
import org.springframework.stereotype.Component;


@Component
public class ErrorServiceActivator {

    @ServiceActivator
    public void receiveError(Message<MessageHandlingException> errorMessage) throws Throwable {
        System.out.println(ExceptionUtils.getFullStackTrace(errorMessage.getPayload().getCause())) ;

    }

}
