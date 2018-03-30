package com.itmuch.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmuch.cloud.entity.User;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {
	
	 @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
	 public User findById(@PathVariable("id") Long id);
}
