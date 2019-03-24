package com.minsuhas.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Mission5Controller.class)
public class Mission5ControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testReturnJson() throws Exception {
        String userJson = "{\"name\":\"minsu\"}";
        mockMvc.perform(post("/resource/hello/minsu/json")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(userJson))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.name", is(equalTo("minsu"))));

    }
}