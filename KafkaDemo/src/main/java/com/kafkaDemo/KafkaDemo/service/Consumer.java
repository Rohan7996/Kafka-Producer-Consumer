package com.kafkaDemo.KafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics="codeDecode", groupId = "codeDecode_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("Consumer read message successfully from Kafka Topic "+receivedMessage);
    }
}
