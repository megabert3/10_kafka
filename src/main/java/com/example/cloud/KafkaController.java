package com.example.cloud;

import com.example.cloud.kafka.producer.DemoGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    DemoGateway demoChanel;

    @GetMapping("/kafka/{message}")
    public void sendMessKafka(@PathVariable("message") String message){
        demoChanel.directChanel(message);
    }
}
