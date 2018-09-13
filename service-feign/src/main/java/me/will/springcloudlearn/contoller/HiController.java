package me.will.springcloudlearn.contoller;

import me.will.springcloudlearn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HiController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "/hi")
    public String sayHi(String name) {
        return testService.sayHiFromClientOne( name );
    }
}
