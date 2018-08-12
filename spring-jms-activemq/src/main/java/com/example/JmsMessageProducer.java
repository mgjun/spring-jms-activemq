package com.example;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsMessageProducer implements MessageSender {

    protected JmsTemplate jmsTemplate;

    public JmsMessageProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(message);
    }
}
