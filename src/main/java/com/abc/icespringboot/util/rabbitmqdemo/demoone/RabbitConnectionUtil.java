package com.abc.icespringboot.util.rabbitmqdemo.demoone;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 11:29 2018/8/23 0023
 */

public class RabbitConnectionUtil {
    private static final String RABBIT_HOST = "localhost";

    private static final String RABBIT_USERNAME = "admin";

    private static final String RABBIT_PASSWORD = "admin";

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost(RABBIT_HOST);
            connectionFactory.setUsername(RABBIT_USERNAME);
            connectionFactory.setPassword(RABBIT_PASSWORD);

            try {
                connection = connectionFactory.newConnection();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
