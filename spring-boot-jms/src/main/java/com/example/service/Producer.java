package com.example.service;

import com.example.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;


@Service("producer")
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination,final Email message){
        jmsTemplate.convertAndSend(destination,message);
    }

    @JmsListener(destination="out.queue")
    public void consumerMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }
}
