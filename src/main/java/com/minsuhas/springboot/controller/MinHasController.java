package com.minsuhas.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MinHasController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "mission1";
    }

    @RequestMapping(value = "/hello/{name}", method = {RequestMethod.GET, RequestMethod.POST})
    public String nameChange(Model model, @PathVariable String name) {
        model.addAttribute("returnName", name);
        return "mission2";
    }

}
