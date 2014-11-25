package org.hyp.springboot.home;

import org.hyp.springboot.rest.web.HomeController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by huangyp on 2014/11/25.
 */
public class HomeControllerTests {

    private MockMvc mvc;

    @Before
    public void setup() throws Exception {
        this.mvc = standaloneSetup(new HomeController()).alwaysExpect(status().isOk()).build();
    }

    @Test
    public void homePost() throws Exception {
        this.mvc.perform(post("/home"))
                .andExpect(content().string("Hello!"));
    }

}
