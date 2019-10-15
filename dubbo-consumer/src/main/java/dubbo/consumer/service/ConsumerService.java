package dubbo.consumer.service;

import dubbo.api.model.User;

public interface ConsumerService {
	public User getUser(String name);
}
