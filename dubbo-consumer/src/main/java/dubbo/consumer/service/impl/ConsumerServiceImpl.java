package dubbo.consumer.service.impl;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import dubbo.api.model.User;
import dubbo.api.service.UserService;
import dubbo.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Reference
	private UserService userService;
	
	@Override
	public User getUser(String name) {
		return userService.getUserByName(name);
	}

}
