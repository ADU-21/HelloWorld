package com.tw.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yxtan on 7/11/16.
 */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, nice to meet you, %s !";

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name){
        return new Greeting(String.format(TEMPLATE,name));
    }
}
