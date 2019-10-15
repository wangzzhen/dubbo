package dubbo.provider.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dubbo.api.model.User;
import dubbo.api.service.UserService;
import dubbo.provider.dao.UserDao;

@Component
//属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}

}
