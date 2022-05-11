package com.seeinplays.spruce.services;

import com.seeinplays.spruce.models.Message;

public class MessageService {

    public Message generateMessage(Message message) {
        Message generatedMessage = new Message(message.getDomain(), message.getAddress(), message.getUri(), message.getVersion(),
                message.getStatement(), message.getNonce(), message.getChainId(), message.getIssuedAt(),
                message.getExpirationTime(), message.getNotBefore(), message.getRequestID(), message.getResources());
        return generatedMessage;
    }
}
