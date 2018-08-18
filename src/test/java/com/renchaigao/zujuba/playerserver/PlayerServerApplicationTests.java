package com.renchaigao.zujuba.playerserver;

import com.renchaigao.zujuba.mongoDB.info.user.UserInfo;
import com.renchaigao.zujuba.playerserver.controller.kafkatest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayerServerApplicationTests {
	@Autowired
	private kafkatest kafkatest;
	@Test
	public void contextLoads() {
	}

	@Test
	//然后每隔1分钟执行一次
//	@Scheduled(fixedRate = 1000 * 3)
	public void kafkaSendTest()throws Exception{
		kafkatest.sendTest();
	}
}
