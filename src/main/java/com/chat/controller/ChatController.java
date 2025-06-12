package com.chat.controller;

import com.chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ChatController {
//    this controller handle all the incoming message from user1 and user2 and broadcast to all the client.

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}
