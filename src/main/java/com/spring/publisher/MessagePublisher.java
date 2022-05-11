package com.spring.publisher;

import java.util.UUID;

import com.spring.entity.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Constants;

@RestController 
@RequestMapping("/message")
public class MessagePublisher {
 
	@Autowired
	private RabbitTemplate rabbitTemplate;
	 
		@PostMapping("/insert")
		public String bookOrder(@RequestBody Message message ) {
			message.setMessageID(UUID.randomUUID().toString());

			rabbitTemplate.convertAndSend(Constants.EXCHANGE,Constants.ROUTING_KEY, message);
			return "success!!";
		}
}
