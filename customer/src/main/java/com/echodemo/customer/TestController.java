package com.echodemo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Controller
@RequestMapping("customer")
public class TestController {
    private static final Logger Log = Logger.getLogger(TestController.class.getName());

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("testv1")
    @ResponseBody
    public String testOrderWithEureka(){
        Log.info("-----customer测试-----");
        return restTemplate.getForObject("http://order/order/create/echodemo", String.class, "");
    }
}
