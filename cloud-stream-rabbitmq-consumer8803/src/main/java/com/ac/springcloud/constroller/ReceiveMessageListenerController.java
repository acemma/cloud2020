package com.ac.springcloud.constroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author acemma
 * @Date 2021/11/12 14:53
 * @Description
 */

@Slf4j
@EnableBinding(Sink.class)
@Component
public class ReceiveMessageListenerController {


    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void receiveMsg(Message<String> msg) {
        log.info("消费者2号， 接收的消息：" + msg.getPayload() + "\t" + "serverPort:" + serverPort);

    }


}
