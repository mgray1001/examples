package org.sudoinit5.mgray.springintegration.examples.demo1;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Header;
import org.springframework.integration.annotation.Headers;
import org.springframework.integration.annotation.Payload;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.file.FileHeaders;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Map;


@Component
public class Demo1ServiceActivator {


    /*
    @ServiceActivator public void demoRecieveFile( File file ) {

    }


    @ServiceActivator public void demoRecieveFile( @Headers Map<String, Object> headers, @Payload File file) {

    }

    @ServiceActivator public void demoRecieveFile( @Header(FileHeaders.FILENAME) String filename, @Payload File file) {

    }
    */

    @ServiceActivator
    public void demoReceiveFile( Message<File> msg) {

        File file = msg.getPayload() ;

        Map<String,Object> headers  = msg.getHeaders() ;
                                      for(String i: msg.getHeaders().keySet())
                                          System.out.println(i);

        System.out.println("Filename and path: " + file.getAbsolutePath());
    }
}
