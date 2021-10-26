package com.tuesday.kafkademo.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    // Topic name
    // KafkaTemplate
    // Send message to topic

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    private static final String TOPIC = "county-events";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        logger.info("Sending message:: " + message);
        kafkaTemplate.send(TOPIC, message);
    }
}
