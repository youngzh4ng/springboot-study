package com.test.springboot.config;

import com.test.springboot.template.rest.HRCProxyCustomizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class RestProxyConfiguration {

    @Value("${app.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    @DependsOn(value = "hrcProxyCustomizer")
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder(hrcProxyCustomizer());
    }

    @Bean
    public HRCProxyCustomizer hrcProxyCustomizer() {
        System.out.println("Customising HRCProxyCustomizer");
        return new HRCProxyCustomizer();
    }
}
