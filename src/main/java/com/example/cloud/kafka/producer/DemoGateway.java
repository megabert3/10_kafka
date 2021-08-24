package com.example.cloud.kafka.producer;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface DemoGateway {

    @Gateway(requestChannel = ProducerChanel.DEMO)
    void directChanel(String string);
}