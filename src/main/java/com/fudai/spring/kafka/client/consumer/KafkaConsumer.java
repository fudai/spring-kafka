/**
 * Copyright (c) 2009-2023 fudai,Inc.All Rights Reserved.
 *
 * @fileName: KafkaConsumer
 * @package: com.fudai.spring.kafka.client.consumer
 * @date: 2023-02-20 11:51
 * @version: V1.0
 */
package com.fudai.spring.kafka.client.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @className: KafkaConsumer
 * @description: Kafka消费者
 * @author: fudai
 * @date: 2023-02-20 11:51
 */
@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.biz.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void receiveMessage(Object message) {
        log.info("接收消息：{}", message);
    }

}
