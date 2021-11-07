package com.producers.rabbitproducerclient;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/publish")
@Slf4j
public class MessageRestController {
    private final SendMessageService sendMessageService;

    @PostMapping(path = "/message")
    @ResponseBody
    public String sendToRabbitMq(@RequestBody User myMessage){
        sendMessageService.send(myMessage);
        log.info("Message has been sent to rabbitmq " + myMessage);

        return "Message has been sent to rabbitmq ";


    }
}
