package org.hyp.springboot.rest.web;

import org.hyp.springboot.rest.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    FooService fooService;

    @RequestMapping(method = RequestMethod.GET)
    String get() {
        fooService.foo();
        return "Hello!";
    }

    @RequestMapping(method = RequestMethod.POST)
    String post() {
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