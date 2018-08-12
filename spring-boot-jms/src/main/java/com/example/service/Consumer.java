package com.example.service;

import com.example.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

@Service("consumer")
public class Consumer {

    @Autowired
    private JmsTemplate jmsTemplate;

//    @JmsListener(destination = "mytest.queue")
    public void receiveMessage(Email text) {
        System.out.println("Consumer收到的报文为:"+text);
    }


    public String receiveMessageManual(Destination destination) throws JMSException {
        jmsTemplate.setDefaultDestination(destination);
        TextMessage textMessage = (TextMessage) jmsTemplate.receiveAndConvert();
        return textMessage.getText();
    }
}
