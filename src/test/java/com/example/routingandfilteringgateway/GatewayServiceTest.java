package com.example.routingandfilteringgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.venu.services.micro.GatewayService;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT, classes = GatewayService.class)
public class GatewayServiceTest {

    @Autowired
    private TestRestTemplate rest;

 
}
