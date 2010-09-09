package org.sudoinit5.mgray.springintegration.examples.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("demo1.xml");

        classPathXmlApplicationContext.start();
    }
}
