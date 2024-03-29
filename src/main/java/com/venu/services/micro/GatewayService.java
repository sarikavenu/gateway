package com.venu.services.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@EnableZuulProxy
@SpringBootApplication
public class GatewayService {

  public static void main(String[] args) {
    System.out.println("CORS Enabled in Gateway");
    SpringApplication.run(GatewayService.class, args);
  }

}
