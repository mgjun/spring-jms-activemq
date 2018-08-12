package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class JmsMessageSyncConsumer {

    private static final Logger logger = LoggerFactory.getLogger(JmsMessageProducer.class);
    private JmsTemplate template;

    public JmsMessageSyncConsumer(JmsTemplate template) {
        this.template = template;
    }

    public String receiveMessage() throws JMSException {
        return (String)template.receiveAndConvert();
    }
}
