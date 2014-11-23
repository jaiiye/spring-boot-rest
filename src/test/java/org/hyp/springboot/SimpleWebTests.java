package org.hyp.springboot;

import org.hyp.springboot.rest.web.HomeController;
import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SimpleWebTests {
    @Test
    public void simple() throws Exception {
        standaloneSetup(new HomeController()).build()
                .perform(get("/home/simple"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(content().string("Hello!"));
    }
}
