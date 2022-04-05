package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBean.xml");
        Shape shape= (Shape) applicationContext.getBean("shape");
        shape.display();
    }
}
