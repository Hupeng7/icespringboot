package com.abc.icespringboot.util.rabbitmqdemo.topicqueue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:15 2018/8/24 0024
 */
@Slf4j
public class ConsumerG {
    private static final String EXCHANGE_NAME = "test_exchange_topic";

    private static final String QUEUE_NAME = "test_queue_topic_g";

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        //channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "order.*");
        channel.basicQos(1);

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                super.handleDelivery(consumerTag, envelope, properties, body);
                log.info("接收消息: " + new String(body, "utf-8"));
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
