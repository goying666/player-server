package com.renchaigao.zujuba.playerserver;

import com.renchaigao.zujuba.playerserver.controller.kafkatest;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.renchaigao.zujuba.dao.mapper")
@EnableScheduling
public class PlayerServerApplication {


	@Autowired
	private kafkatest kafkatest;

	public static void main(String[] args) {
		SpringApplication.run(PlayerServerApplication.class, args);
	}
    @Scheduled(fixedRate = 1000 * 3)
    public void kafkaSendTest()throws Exception{
//        kafkatest kafkatest = new kafkatest();
        kafkatest.sendTest();
    }
}
