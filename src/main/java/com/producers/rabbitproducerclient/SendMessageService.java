package com.producers.rabbitproducerclient;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendMessageService {
    @Autowired
    private final RabbitTemplate rabbit;

    private final static String EXCHANGE = "custom.myexchange1";
    private final static String ROUTING_KEY = "custom.myExchange1";

    //function to send out a message with the exchange method and a routing key
    public void send(User message){
        rabbit.convertAndSend(EXCHANGE, ROUTING_KEY, message);
    }

}
