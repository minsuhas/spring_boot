package com.minsuhas.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MinHasController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/hello/{name}", method = {RequestMethod.GET, RequestMethod.POST})
    public String nameChange(HttpServletRequest request, ModelMap map, Model model, @PathVariable("name") String name) {
        model.addAttribute("returnName", "hello " + name);
        return "hello";
    }

}
