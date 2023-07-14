package com.elcarim.helloworld.service;

import com.elcarim.helloworld.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message messageBuilder(){
        String mes = "Hello Mira";
        Message message = new Message();
        message.setMessage(mes);
        return message;
    }
}
