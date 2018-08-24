package com.abc.icespringboot.util.rabbitmqdemo.routingqueue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:58 2018/8/23 0023
 */
@Slf4j
public class ProducerEF {
    private static final String EXCHANGE_NAME = "test_exchange_direct";

    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "direct");

        String messageE = "this is message E";
        channel.basicPublish(EXCHANGE_NAME, "E", null, messageE.getBytes("utf-8"));
        log.info("生产者 send: " + messageE);
        String messageF = "this is message F";
        channel.basicPublish(EXCHANGE_NAME, "F", null, messageF.getBytes("utf-8"));
        log.info("生产者 send: " + messageF);
        channel.close();
        connection.close();

    }

}
