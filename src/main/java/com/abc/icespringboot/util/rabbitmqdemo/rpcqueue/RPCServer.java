package com.abc.icespringboot.util.rabbitmqdemo.rpcqueue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:50 2018/8/24 0024
 */
@Slf4j
public class RPCServer {
    private static final String RPC_QUEUE_NAME = "rpc_queue";

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitConnectionUtil.getConnection();
        final Channel channel = connection.createChannel();
        channel.queueDeclare(RPC_QUEUE_NAME, false, false, false, null);
        channel.basicQos(1);

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                super.handleDelivery(consumerTag, envelope, properties, body);
                AMQP.BasicProperties properties1 = new AMQP.BasicProperties.Builder().correlationId(properties.getCorrelationId()).build();
                String message = new String(body, "utf-8");
                int num = Integer.valueOf(message);
                log.info("接收数据: " + num);
                num = fib(num);
                channel.basicPublish("", properties.getReplyTo(), properties1, String.valueOf(num).getBytes("utf-8"));
            }
        };
        channel.basicConsume(RPC_QUEUE_NAME, false, consumer);
        while (true) {
            synchronized (consumer) {
                try {
                    consumer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取斐波那契数据的第n个值的大小
     */
    private static int fib(int n) {
        System.out.println("n=====>"+n);
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
