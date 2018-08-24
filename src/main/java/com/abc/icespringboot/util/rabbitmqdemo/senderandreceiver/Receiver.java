package com.abc.icespringboot.util.rabbitmqdemo.senderandreceiver;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:27 2018/8/21 0021
 */
public class Receiver {
    private final static String QUEUE_NAME = "MyQueue";

    public static void main(String[] args) {
        receive();
    }

    private static void receive() {
        ConnectionFactory factory = null;
        Connection connection = null;
        Channel channel = null;

        try {
            factory = new ConnectionFactory();
            factory.setHost("localhost");

            connection = factory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    //super.handleDelivery(consumerTag, envelope, properties, body);
                    System.out.println("************");
                    String message = new String(body, "UTF-8");
                    System.out.println("收到消息:" + message);
                }
            };
            channel.basicConsume(QUEUE_NAME, true, consumer);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
            try {
                channel.close();
                connection.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (TimeoutException e1) {
                e1.printStackTrace();
            }
        }
    }
}
