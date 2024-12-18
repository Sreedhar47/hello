package com.vsr.Hello.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ApiController.class)
public class ApiControllerTest {
	
	@Autowired
    private MockMvc mockMvc;

    @Test
    public void testWelcomeEndpoint() throws Exception {
        mockMvc.perform(get("/get"))
               .andExpect(status().isOk())
               .andExpect(content().string("WELCOME TO HELLO API"));
    }

}
