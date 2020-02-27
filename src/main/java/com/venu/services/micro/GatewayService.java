package com.venu.services.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GatewayService {

  public static void main(String[] args) {
    System.out.println("Gateway Modified Venu1");
    SpringApplication.run(GatewayService.class, args);
  }

}
