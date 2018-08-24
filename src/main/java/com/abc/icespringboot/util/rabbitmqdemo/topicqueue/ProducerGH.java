package com.abc.icespringboot.util.rabbitmqdemo.topicqueue;

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
 * @date: 10:10 2018/8/24 0024
 */
@Slf4j
public class ProducerGH {
    private static final String EXCHANGE_NAME = "test_exchange_topic";

    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        String message = "匹配insert";

        channel.basicPublish(EXCHANGE_NAME, "order.insert", false, false, null, message.getBytes("utf-8"));
        log.info("生产者 send : " + message);
        channel.close();
        connection.close();
    }
}
