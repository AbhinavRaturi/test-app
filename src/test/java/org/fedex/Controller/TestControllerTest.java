package org.fedex.Controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestController.class)
@TestPropertySource(locations = {"classpath:application.properties"})
class TestControllerTest {
    @Autowired
    TestController testController;

    @Value("${wiremock.url}")
    private String wiremockURL;

    @Test
    void testApi() {
        System.out.println(testController.testApi());
        assertThat(testController.testApi()).isEqualTo("Hello");
    }

    @Test
    void getList() {
        ReflectionTestUtils.setField(testController, "testUrl", wiremockURL);
        assertThat(testController.getList().isEnabled()).isTrue();
    }

    @Test
    void getUserInfo() {
        ReflectionTestUtils.setField(testController, "testUrl", wiremockURL);
        assertThat(testController.getUserInfo().isEnabled()).isTrue();
    }
}