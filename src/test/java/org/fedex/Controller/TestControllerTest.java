package org.fedex.Controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testApi() throws Exception {
        MvcResult result = mockMvc.perform(get("/test-api"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello")))
                .andReturn();

        String content = result.getResponse().getContentAsString();
        System.out.println(content);
    }
}
