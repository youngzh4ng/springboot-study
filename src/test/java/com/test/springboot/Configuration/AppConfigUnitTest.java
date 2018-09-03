package com.test.springboot.Configuration;

import com.test.springboot.config.RestProxyConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@ContextConfiguration(classes = {RestProxyConfiguration.class}, initializers = ConfigFileApplicationContextInitializer.class)
public class AppConfigUnitTest {

    @Autowired
    private ConfigurableEnvironment env;

    @Autowired
    private RestProxyConfiguration restProxyConfiguration;

    @Before
    public void setup() {
        TestPropertyValues.of("app.name=test_name_in_test_property_values").applyTo(env);
    }

    @Test
    public void test_should_get_spring_boot_test_dev_when_active_profile_is_test() {
//        assertThat(restProxyConfiguration.getName()).isEqualTo("Spring Boot Test - dev- in application-test.yml");
        assertThat(restProxyConfiguration.getName()).isEqualTo("Spring Boot Test - dev");
    }

    @Test
    public void should_get_set_property() {
        assertThat(env.getProperty("app.name")).isEqualTo("test_name_in_test_property_values");
    }

}
