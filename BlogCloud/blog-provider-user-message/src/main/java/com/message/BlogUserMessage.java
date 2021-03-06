package com.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com")
@EnableCircuitBreaker
@EnableDiscoveryClient
public class BlogUserMessage {
  public static void main(String[] args) {
    SpringApplication.run(BlogUserMessage.class, args);
  }
}
