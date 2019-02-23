package com.echodemo.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
@RequestMapping("order")
public class TestController {
    private static final Logger Log = Logger.getLogger(TestController.class.getName());

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("create/{name}")
    public String create(@PathVariable("name") String name) {
        Log.info("-----order测试-----");
        return "order create successful , name = " + name + ", current port= " + port;
    }

}
