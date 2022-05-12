package com.seeinplays.spruce;

import com.seeinplays.spruce.models.Message;
import com.seeinplays.spruce.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MessageController {

    @Autowired
    MessageService service = new MessageService();

    @PostMapping("/sign_in")
    public @ResponseBody Message getMessage(@RequestBody Message requestMessage) {
        Message message = new Message();

        message.setVersion("1");
        message.setAddress(requestMessage.getAddress());

        return message;
    }

    @GetMapping("/oing")
    public String ping() {
        return "ping pong!";
    }

}
