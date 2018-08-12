package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.JMSException;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class JmsMessageSyncConsumerTest {


    @Autowired
    private JmsMessageSyncConsumer jmsMessageSyncConsumer;

    @Test
    public void testSyncMessage() throws JMSException {
        System.out.println(jmsMessageSyncConsumer.receiveMessage());
    }

}