package com.abc.icespringboot.util.rabbitmqdemo.workqueue;

import com.abc.icespringboot.util.rabbitmqdemo.demoone.RabbitConnectionUtil;
import com.rabbitmq.client.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * 没测试成功  todo
 * @date: 16:14 2018/8/23 0023
 */
@Slf4j
public class ConsumerB {
    public static final String QUEUE_NAME = "test_queue_work";

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        //能者多劳模式
        channel.basicQos(1);
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                super.handleDelivery(consumerTag, envelope, properties, body);
                String message = new String(body, "utf-8");
                log.info("ConsumerC receive message " + message);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    doWork(message);
                } catch (Exception e) {
                    e.printStackTrace();
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            }
        };
        //监听队列，当b为true时，为自动提交（只要消息从队列中获取，无论消费者获取到消息后是否成功消息，都认为是消息已经成功消费），
        // 当b为false时，为手动提交（消费者从队列中获取消息后，服务器会将该消息标记为不可用状态，等待消费者的反馈，
        // 如果消费者一直没有反馈，那么该消息将一直处于不可用状态。
        //如果选用自动确认,在消费者拿走消息执行过程中出现宕机时,消息可能就会丢失！！）
        //使用channel.basicAck(envelope.getDeliveryTag(),false);进行消息确认
        channel.basicConsume(QUEUE_NAME, false, consumer);

    }

    private static void doWork(String task) {
        for (char ch : task.toCharArray()) {
            if (ch == '.') {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }


    }


}
