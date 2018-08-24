package com.abc.icespringboot.util.rabbitmqdemo.publishandsubcribequeue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:42 2018/8/23 0023
 */
@Slf4j
public class ConsumerD {
    public static final String QUEUE_NAME = "test_queue_exchange_d";

    public static final String EXCHANGE_NAME = "test_exchange_fanout";

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

         /*
            绑定队列到交换机（这个交换机名称一定要和生产者的交换机名相同）
             参数1：队列名
             参数2：交换机名
             参数3：Routing key 路由键
          */
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "");

        channel.basicQos(1);

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                super.handleDelivery(consumerTag, envelope, properties, body);
                String message = new String(body, "utf-8");
                log.info("收到消息:"+message);
                channel.basicAck(envelope.getDeliveryTag(),false);
            }
        };
        channel.basicConsume(QUEUE_NAME,false,consumer);
    }
}
