package com.it.test;

import com.it.demo.MyMessageListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-jms-consumer.xml")
public class TestQueue  {

    @Test
    public void demo() throws IOException {
         System.in.read();//spring与activeMQ整合--文本消息测试可以发送消息到MQ队列里
    }
}
