package com.example.service;

import com.example.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service("consumerEnd")
public class ConsumerEnd {


//    @JmsListener(destination = "mytest.queue")
//    @SendTo("out.queue")
    public String receiveMessage(Email text) {
        System.out.println("Consumer收到的报文为:"+text);
        return "send to:"+ text;
    }
}
