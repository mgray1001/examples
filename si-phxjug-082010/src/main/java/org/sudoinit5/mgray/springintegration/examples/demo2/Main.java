package org.sudoinit5.mgray.springintegration.examples.demo2;

import org.apache.commons.lang.SystemUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;


public class Main {
    public static void main(String[] args) throws Throwable {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("demo2.xml");


        File tempFile = new File(SystemUtils.getUserHome(), "Desktop/temp.csv");

        Demo2ChannelClient client2 = classPathXmlApplicationContext.getBean(Demo2ChannelClient.class);
        client2.startProcess(tempFile);
    }
}
