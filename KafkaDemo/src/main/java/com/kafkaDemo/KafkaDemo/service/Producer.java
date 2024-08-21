package com.kafkaDemo.KafkaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    //kafkaTemplate helps us to send the message in newly created topic

    public void sendMsgToProducer(String message){
        kafkaTemplate.send("codeDecode", message);
    }
}
