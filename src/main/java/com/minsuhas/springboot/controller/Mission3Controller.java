package com.minsuhas.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Mission3Controller {

    @RequestMapping(value = "/hello2/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String returnName(@PathVariable String name) {
        return name;
    }
}
