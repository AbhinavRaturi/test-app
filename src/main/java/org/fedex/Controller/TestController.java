package org.fedex.Controller;

import org.fedex.Model.AllowList;
import org.fedex.Model.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Value("${test.url}")
    private String testUrl;
    private final RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/test-api")
    public String testApi() {
        // Test
        return "Hello";
    }

    @GetMapping(value = "/getList")
    public AllowList getList() {
        System.out.println(testUrl);
        return restTemplate.getForObject(testUrl + "/allowlist", AllowList.class);
    }
    @GetMapping(value = "/getUserInfo")
    public UserInfo getUserInfo() {
        System.out.println(testUrl);
        return restTemplate.getForObject(testUrl + "/UserInfo", UserInfo.class);
    }


}
