package com.abc.icespringboot.util.rabbitmqdemo.rpcqueue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:20 2018/8/24 0024
 */
@Slf4j
public class RPCClient {
    private Connection connection;
    private Channel channel;
    private String requestQueueName = "rpc_queue";
    private String replyQueueName;

    public RPCClient() throws IOException {
        connection = RabbitConnectionUtil.getConnection();
        channel = connection.createChannel();
        replyQueueName = channel.queueDeclare().getQueue();
    }

    public String call(String message) throws IOException, InterruptedException {
        final String corrId = UUID.randomUUID().toString();
        AMQP.BasicProperties properties = new AMQP.BasicProperties
                .Builder()
                .correlationId(corrId)
                .replyTo(replyQueueName)
                .build();

        channel.basicPublish("", requestQueueName, properties, message.getBytes("utf-8"));
        final BlockingQueue<String> response = new ArrayBlockingQueue<String>(1);

        channel.basicConsume(replyQueueName, true, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                // super.handleDelivery(consumerTag, envelope, properties, body);
                if (properties.getCorrelationId().equals(corrId)) {
                    response.offer(new String(body, "utf-8"));
                }
            }
        });
        //close();
        return response.take();
    }

    public void close() throws IOException {
        connection.close();
    }

}
