package com.seeinplays.spruce.services;

import com.seeinplays.spruce.models.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message generateMessage(Message message) {
        Message generatedMessage = new Message();
        return generatedMessage;
    }
}
