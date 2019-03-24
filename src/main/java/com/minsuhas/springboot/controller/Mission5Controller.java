package com.minsuhas.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mission5Controller {

    @RequestMapping(value = "/resource/hello/{name}/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public User returnJson(@PathVariable String name) {

        User user = new User();
        user.setName(name);

        return user;
    }

}
