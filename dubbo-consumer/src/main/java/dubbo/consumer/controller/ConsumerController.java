package dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dubbo.api.model.User;
import dubbo.consumer.service.ConsumerService;

@RestController
public class ConsumerController {
	
	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping("/getUser")
	public User getUser(String name) {
		return consumerService.getUser(name);
	}
}
