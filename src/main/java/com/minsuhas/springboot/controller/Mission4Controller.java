package com.minsuhas.springboot.controller;


import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class Mission4Controller {

    @GetMapping(value = "/resource/hello/image", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] returnImage() throws IOException {
        InputStream in = getClass()
                .getResourceAsStream("/static/cat_1.jpg");
        return IOUtils.toByteArray(in);
    }
}
