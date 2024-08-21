package com.kafkaDemo.KafkaDemo.controller;

import com.kafkaDemo.KafkaDemo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class kafkaController {
    @Autowired
    Producer producer;
    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message){
        producer.sendMsgToProducer(message);
    }
}
