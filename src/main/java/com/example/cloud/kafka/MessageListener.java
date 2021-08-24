package com.example.cloud.kafka;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class MessageListener {
    private Logger logger = Logger.getLogger(MessageListener.class);

    /*@KafkaListener(id="1", topics="demo")
    public void msgListener(String msg){
        logger.debug("Directed: " + msg);
    }*/

    @StreamListener(ConsumerChannels.DEMO)
    public void directed(String message) {
        System.out.println(message);
    }
}