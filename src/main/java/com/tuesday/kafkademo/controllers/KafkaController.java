package com.tuesday.kafkademo.controllers;

import com.tuesday.kafkademo.producer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    // Producer

    @Autowired
    private Producer producer;

    @PostMapping(value = "/send")
    public void sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }
}
