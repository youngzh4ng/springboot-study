package com.test.springboot.template.rest;

import com.test.springboot.template.interception.CommonHttpRequestInterceptor;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

public class HRCProxyCustomizer implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {

        restTemplate.getInterceptors().add(new CommonHttpRequestInterceptor());
    }

}
