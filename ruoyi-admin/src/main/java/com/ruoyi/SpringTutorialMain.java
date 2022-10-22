package com.ruoyi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTutorialMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorldInterface obj = context.getBean("helloWorld", HelloWorldInterface.class);
        obj.getMessage();
    }
}
