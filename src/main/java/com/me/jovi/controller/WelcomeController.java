package com.me.jovi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joyce on 2018/1/3
 */
@RestController
@RequestMapping(value = "/")
public class WelcomeController {

    @RequestMapping(value = "")
    public String hello(){
        return "<h2>Hello World</h2>";
    }

    @RequestMapping("/hi/{id}")
    public String helloPath(@PathVariable String id, String test){
        return "你好，"+id+" >>>> "+test;
    }

    @RequestMapping("/ok")
    public String helloParam(String what){
        return "什么 ： "+ what;
    }
}
