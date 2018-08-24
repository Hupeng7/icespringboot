package com.abc.icespringboot.util.rabbitmqdemo.demoone;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:59 2018/8/23 0023
 */
@Slf4j
public class Producer {
    private static final String QUEUE_NAME = "test_queue";

    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        Connection connection = RabbitConnectionUtil.getConnection();
        log.info("connection is:", connection);

        Channel channel = connection.createChannel(1);
        /*
         * 声明（创建）队列
         * 参数1：队列名称
         * 参数2：为true时server重启队列不会消失
         * 参数3：队列是否是独占的，如果为true只能被一个connection使用，其他连接建立时会抛出异常
         * 参数4：队列不再使用时是否自动删除（没有连接，并且没有未处理的消息)
         * 参数5：建立队列时的其他参数
         */
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message;

        int count = 1;
        for (int i = 0; i < count; i++) {
            message = "hello world ,this is queue message =========>" + (i + 1);
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes("utf-8"));
            //Thread.sleep(1000);
            log.info("生产者 send " + message);
        }

        channel.close();
        connection.close();
    }
}
