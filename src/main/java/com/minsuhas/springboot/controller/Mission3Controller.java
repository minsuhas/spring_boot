package com.minsuhas.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mission3Controller {

    @RequestMapping(value = "/hello/{name}")
    public String returnName(@PathVariable String name) {
        return name;
    }
}
