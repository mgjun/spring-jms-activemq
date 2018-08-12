package com.example.service;

import com.example.Email;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringJmsTest {


    @Autowired
    private Producer producer;

    @Autowired
    private Consumer consumer;

    @Test
    public void testSendMessage() {
        producer.sendMessage(new ActiveMQQueue("mytest.queue"),new Email("xxx@info.com","hello jms"));
    }


    @Test
    public void testReceiveMessageManual() throws Exception{
        String receivedMessage = consumer.receiveMessageManual(new ActiveMQQueue("mytest.queue"));
        System.out.println(receivedMessage);
    }

}