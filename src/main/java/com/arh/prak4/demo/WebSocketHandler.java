package com.arh.prak4.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {

    /**
     * Метод, который вызывается при получении текстового сообщения.
     * Здесь мы просто берём входящее сообщение и отправляем его обратно.
     * @param session
     * @param message
     * @throws Exception
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        TextMessage responseMessage = new TextMessage(payload);
        session.sendMessage(responseMessage);
    }
}
