package com.tuesday.kafkademo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "country-events", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumer received message: " + message);
    }
}
