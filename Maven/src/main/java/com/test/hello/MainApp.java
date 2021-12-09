package com.test.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

Helloworld obj = (Helloworld) context.getBean("helloWorld");

obj.getMessage();
}

    }


