package com.example.cloud.kafka.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProducerChanel {

    String DEMO = "demo";

    @Output(DEMO)
    MessageChannel demoTopic();
}
