package com.ac.springcloud.controller;

import com.ac.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author acemma
 * @Date 2021/11/12 14:06
 * @Description
 */

@RestController
public class SendMessageController {

    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping(value = "/send/message")
    public String sendMsg() {
        return messageProvider.send();
    }
}
