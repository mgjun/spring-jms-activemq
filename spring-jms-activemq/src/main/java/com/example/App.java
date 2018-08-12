package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("application.xml");
        MessageSender sender = ctx.getBean(MessageSender.class);
        sender.sendMessage("Hello");
        ctx.close();
    }
}