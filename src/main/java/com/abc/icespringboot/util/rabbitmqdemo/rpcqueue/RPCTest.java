package com.abc.icespringboot.util.rabbitmqdemo.rpcqueue;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:33 2018/8/24 0024
 */
@Slf4j
public class RPCTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        RPCClient rpcClient = new RPCClient();
        System.out.println(rpcClient.call("6"));
    }
}
