package com.example.consumer.domo.consumer.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic}")
    public  void listen(Message<String> msg) {
        //apply your application logic to the received msg
        System.out.println(msg.getPayload());
    }

}
