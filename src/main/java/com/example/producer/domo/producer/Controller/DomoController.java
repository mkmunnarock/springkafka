package com.example.producer.domo.producer.Controller;

import com.example.producer.domo.producer.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DomoController {
    @Autowired
    private KafkaProducer kafkaProducer;
    @GetMapping("/publish")
    public String publishMessage(@RequestParam("msg") String msg){
        return kafkaProducer.sendMessage(msg);
    }
}
