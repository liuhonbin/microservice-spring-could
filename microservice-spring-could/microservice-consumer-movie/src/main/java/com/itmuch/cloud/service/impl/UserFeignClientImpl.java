package com.itmuch.cloud.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.service.UserFeignClient;

@Service
public class UserFeignClientImpl implements UserFeignClient {

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(-1L);
		user.setName("默认数据");
		user.setAge((short) -1);
		user.setUsername("默认数据");
		user.setBalance(BigDecimal.valueOf(-1));
		return user;
	}

}
