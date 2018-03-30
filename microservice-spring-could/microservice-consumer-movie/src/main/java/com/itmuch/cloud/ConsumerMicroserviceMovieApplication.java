package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.itmuch.cloud.config.RibbonConfig;
import com.itmuch.cloud.uitl.ExcludeFromComponentScan;


@SpringBootApplication
@RibbonClient(name = "microservice-provider-user",configuration=RibbonConfig.class)
@ComponentScan(excludeFilters= {@ComponentScan.Filter(type=FilterType.ANNOTATION ,value=ExcludeFromComponentScan.class)})
@EnableFeignClients
@EnableEurekaClient
public class ConsumerMicroserviceMovieApplication {


  public static void main(String[] args) {
    SpringApplication.run(ConsumerMicroserviceMovieApplication.class, args);
  }
}
