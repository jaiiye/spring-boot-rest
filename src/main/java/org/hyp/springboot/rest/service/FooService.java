package org.hyp.springboot.rest.service;

import org.springframework.stereotype.Service;

@Service
public class FooService {
    public FooService() {
        System.out.println("Init FooService");
    }

    public void foo() {
        System.out.println("FooService.foo()");
    }
}
