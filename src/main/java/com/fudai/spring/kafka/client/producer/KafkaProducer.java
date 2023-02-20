/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: KafkaProducer
 * @package: com.fudai.spring.kafka.client.producer
 * @date: 2023-02-20 11:41
 * @version: V1.0
 */
package com.fudai.spring.kafka.client.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @className: KafkaProducer
 * @description: Kafka生产者
 * @author: fudai
 * @date: 2023-02-20 11:41
 */
@Service
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.biz.topic}")
    private String topic;

    @Autowired
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage1(String message) {
        log.info("发送消息1：{}", message);
        kafkaTemplate.send(topic, message);
    }

    public void sendMessage2(String key, String message) {
        log.info("发送消息2：{}", message);
        kafkaTemplate.send(topic, key, message);
    }

}
