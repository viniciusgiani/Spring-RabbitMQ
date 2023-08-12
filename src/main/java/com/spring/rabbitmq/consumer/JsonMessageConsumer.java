package com.spring.rabbitmq.consumer;

import com.spring.rabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class JsonMessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonMessageConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void processJsonMessage(User user) {
        LOGGER.info("Received JSON message: {}", user);
    }
}

