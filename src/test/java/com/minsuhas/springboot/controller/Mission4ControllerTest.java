package com.minsuhas.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(Mission4Controller.class)
public class Mission4ControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testReturnImage() throws Exception {
        mockMvc.perform(get("/resource/hello/image")
                .contentType(MediaType.IMAGE_JPEG_VALUE)
                .accept(MediaType.IMAGE_JPEG_VALUE))
                    .andExpect(status().isOk());
    }
}