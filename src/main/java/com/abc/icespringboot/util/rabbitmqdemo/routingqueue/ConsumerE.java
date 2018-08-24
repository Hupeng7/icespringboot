package com.abc.icespringboot.util.rabbitmqdemo.routingqueue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.*;
import javafx.scene.shape.QuadCurve;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 18:06 2018/8/23 0023
 */
@Slf4j
public class ConsumerE {
    private static final String QUEUE_NAME = "test_queue_direct_e";

    private static final String EXCHANGE_NAME = "test_exchange_direct";

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        //先声明队列 声明完成后注释
        //channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        /*
         * 绑定队列到交换机
         * 参数1：队列的名称
         * 参数2：交换机的名称
         * 参数3：routingKey
         */
        channel.queueBind(QUEUE_NAME, EXCHANGE_NAME, "E");
        // 同一时刻服务器只会发一条消息给消费者
        channel.basicQos(1);

        // 定义队列的消费者
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
