package me.will.springcloudlearn.controller;

import me.will.springcloudlearn.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(String name) {
        return helloService.hiService( name );
    }

}
