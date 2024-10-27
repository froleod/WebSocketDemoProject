package com.arh.prak4.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class WebSocketHandler {

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public String processMessageFromClient(String message) {
        return message;
    }
}
