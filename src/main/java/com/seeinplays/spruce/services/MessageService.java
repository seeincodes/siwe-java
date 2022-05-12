package com.seeinplays.spruce.services;

import com.seeinplays.spruce.models.Message;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.security.SecureRandom;
import java.time.LocalDateTime;

@Service
public class MessageService {

    public Message generateMessage(Message message) {
        Message generatedMessage = new Message();

        boolean isValidAddress = isValidAddress(message.getAddress().toString());
        if (isValidAddress){
            generatedMessage.setAddress(message.getAddress());
        }
        else {
            throw new IllegalArgumentException("Invalid wallet address.");
        }

        generatedMessage.setDomain(message.getDomain());
        generatedMessage.setVersion("1"); // Has to be 1
        generatedMessage.setNonce(nonceGenerator());
        generatedMessage.setUri(message.getUri());
        generatedMessage.setStatement("Signed in with Ethereum");
        generatedMessage.setChainId(1); // Main net
        generatedMessage.setIssuedAt(LocalDateTime.now());
        generatedMessage.setUri(message.getUri());

        return generatedMessage;
    }

    public boolean isValidAddress(String addr)
    {
        String regex = "^0x[0-9a-f]{40}$";

        //Print for testing purpose and more verbose output
        //System.out.println("Incoming Address " + addr);

        if(addr.matches(regex))
        {
            return true;
        }
        return false;
    }

    public String nonceGenerator () {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        return random.toString();
    }

}
