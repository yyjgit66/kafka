package com.itany.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Author：汤小洋
 * Date：2019-10-18 16:18
 * Description：<描述>
 */
@Component
public class KafkaConsumer {

    /**
     * 订阅指定主题的消息
     * @param record 消息记录
     */
    @KafkaListener(topics = {"aaa","ccc"})
    public void listen(ConsumerRecord record){
        // System.out.println(record);
        System.out.println(record.topic()+":"+record.value());
    }

}
