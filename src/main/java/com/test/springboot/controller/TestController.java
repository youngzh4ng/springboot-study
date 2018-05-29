package com.test.springboot.controller;


import com.test.springboot.component.MyBean;
import com.test.springboot.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {

    @Autowired
    private MyBean myBean;

    @Autowired
    private AppConfig appConfig;

    public void setAppConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public MyBean getMyBean() {
        return myBean;
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "hello World " + this.getMyBean().getName() + ' ' + this.getMyBean().getIntValue();
    }

    @GetMapping("/configs")
    public String configs() {
        appConfig.getServers().stream().forEach(System.out::println);
        return appConfig.getName() + ' ' + appConfig.getDescription() + ' ' + appConfig.getSecurity().getUsername() + ' ' + appConfig.getSecurity().getPassword();
    }

}
