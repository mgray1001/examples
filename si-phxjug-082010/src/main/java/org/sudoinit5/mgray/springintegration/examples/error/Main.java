package org.sudoinit5.mgray.springintegration.examples.error;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


    public static void main(String[] args) throws Throwable {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("error.xml");
    }


}