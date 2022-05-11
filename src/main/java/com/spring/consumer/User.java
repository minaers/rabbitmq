package com.spring.consumer;

import com.spring.entity.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.spring.Constants;

@Component
public class User {

	@RabbitListener(queues = Constants.QUEUE )
	public void consumeMessageFromQueue(Message message) {
		System.out.println("Message Received from queue: " +message );
	}
}
