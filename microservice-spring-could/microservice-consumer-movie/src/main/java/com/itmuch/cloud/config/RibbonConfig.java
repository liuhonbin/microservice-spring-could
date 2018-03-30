package com.itmuch.cloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itmuch.cloud.uitl.ExcludeFromComponentScan;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@ExcludeFromComponentScan
public class RibbonConfig {

	@Autowired
	private IClientConfig config;
	
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new RandomRule();
	}

}
