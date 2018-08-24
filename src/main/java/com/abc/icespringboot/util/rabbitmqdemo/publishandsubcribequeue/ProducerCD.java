package com.abc.icespringboot.util.rabbitmqdemo.publishandsubcribequeue;

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
 * @date: 16:35 2018/8/23 0023
 */
@Slf4j
public class ProducerCD {
    public static final String EXCHANGE_NAME = "test_exchange_fanout";

    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
        String message;
        int count = 2;
        for (int i = 1; i <= count; i++) {
            message = "订阅消息 " + i;
            channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes("utf-8"));
            log.info("生产者 send : " + message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        channel.close();
        connection.close();
    }

}
