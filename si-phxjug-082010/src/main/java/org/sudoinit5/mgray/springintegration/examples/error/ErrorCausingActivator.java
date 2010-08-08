package org.sudoinit5.mgray.springintegration.examples.error;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ErrorCausingActivator {

    @ServiceActivator
    public  Message<String>  causeError(File file) throws Throwable {
        throw new RuntimeException("Danger! Danger! " + file.getAbsolutePath());
    }


}
