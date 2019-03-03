package com.minsuhas.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MinHasApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testMain() throws Exception {
        // given

        // when

        // then
        assert applicationContext != null;
    }
}