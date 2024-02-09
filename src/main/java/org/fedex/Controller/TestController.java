package org.fedex.Controller;

import org.fedex.Model.AllowList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Value("${allowlist.url}")
    private String allowlistUrl;
    private final RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/test-api")
    public String testApi() {
        // Test
        return "Hello";
    }

    @GetMapping(value = "/getList")
    public AllowList getList() {
        System.out.println(allowlistUrl);
        return restTemplate.getForObject(allowlistUrl + "/allowlist", AllowList.class);
    }
}
