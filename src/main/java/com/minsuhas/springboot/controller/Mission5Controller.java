package com.minsuhas.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mission5Controller {

    @RequestMapping(value = "/resource/hello/{name}/json")
    public User returnJson(@RequestBody User user, @PathVariable String name) {
        user.setName(name);
        return user;
    }

}
