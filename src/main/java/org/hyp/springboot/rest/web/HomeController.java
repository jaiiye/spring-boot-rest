package org.hyp.springboot.rest.web;

import org.hyp.springboot.rest.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    FooService fooService;

    @RequestMapping("/home")
    String home() {
        fooService.foo();
        return "Hello!";
    }
}

@RestController
class HomeErrorController {

    @RequestMapping("/home/error")
    String homeError() {
        return "Hello error!";
    }
}