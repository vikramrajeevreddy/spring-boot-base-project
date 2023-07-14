package com.elcarim.helloworld.controller;

import com.elcarim.helloworld.model.Message;
import com.elcarim.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorld {
    @Autowired
    private MessageService messageService;
    @GetMapping
    public ResponseEntity<Message> getHelloWorld(){
        return ResponseEntity.ok().body(messageService.messageBuilder());
    }
}
