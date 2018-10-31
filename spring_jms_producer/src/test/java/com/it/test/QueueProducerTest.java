package com.it.test;

import com.it.demo.QueueProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-jms-producer.xml")
public class QueueProducerTest {
  @Autowired
    private QueueProducer queueProducer;
   @Test
   public void demo(){
       queueProducer.send("测试可以发送消息到MQ队列里");
   }

}
