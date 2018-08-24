package com.abc.icespringboot.util.rabbitmqdemo.routingqueue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 18:12 2018/8/23 0023
 */
@Slf4j
public class ConsumerF {
    private static final String QUEUE_NAME = "test_queue_direct_f";
    private static final String EXCHANGE_NAME = "test_exchange_direct";

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        //channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "F");

        channel.basicQos(1);

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                super.handleDelivery(consumerTag, envelope, properties, body);
                log.info(new String(body, "utf-8"));
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
