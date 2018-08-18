package com.renchaigao.zujuba.playerserver.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaConsumer {
    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        System.out.println("message is : " + message);
    }
}
