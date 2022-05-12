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
        return service.generateMessage(requestMessage);
    }

    @GetMapping("/ping")
    public String ping() {
        return "ping pong!";
    }

}
