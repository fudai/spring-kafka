/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: TestController
 * @package: com.fudai.spring.kafka.client.controller
 * @date: 2023-02-20 16:15
 * @version: V1.0
 */
package com.fudai.spring.kafka.client.controller;

import com.fudai.spring.kafka.client.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestController
 * @description: 发送消息Controller
 * @author: fudai
 * @date: 2023-02-20 16:15
 */
@RestController
public class TestController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/test/send1")
    public void testSend1(@RequestParam String message) {
        kafkaProducer.sendMessage1(message);
    }

    @GetMapping("/test/send2")
    public void testSend2(@RequestParam String key, @RequestParam String message) {
        kafkaProducer.sendMessage2(key, message);
    }

}
