package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component
public class JmsMessageListener implements MessageListener {
    private static final Logger logger = LoggerFactory.getLogger(JmsMessageListener.class);
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage msg = (TextMessage) message;
            System.out.println("Consumed message: " + msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
