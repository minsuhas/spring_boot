package com.minsuhas.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mission3Controller {

    @RequestMapping(value = "/hello/{name}", method = {RequestMethod.GET, RequestMethod.POST})
    public String returnString(@PathVariable String name) {
        return name;
    }
}
