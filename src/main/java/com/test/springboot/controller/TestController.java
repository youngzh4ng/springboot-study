package com.test.springboot.controller;


import com.test.springboot.component.MyBean;
import com.test.springboot.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configs")
public class TestController {

    private MyBean myBean;

    private AppConfig appConfig;

    @Autowired
    public void setAppConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @Autowired
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "hello World " + myBean.getName() + ' ' + myBean.getIntValue();
    }

    @GetMapping("")
    public String configs() {
        appConfig.getServers().forEach(System.out::println);
        return appConfig.getName() + ' ' + appConfig.getDescription() + ' ' + appConfig.getSecurity().getUsername() + ' ' + appConfig.getSecurity().getPassword();
    }

    @GetMapping("/extra")
    public String extraConfigs() {
        return appConfig.getKebabCase() + ", " + appConfig.getCamelCase() + ", " + appConfig.getUnderscoreNotation() + ", " + appConfig.getUpperCase();
    }

    @GetMapping("/list")
    public String listConfigs() {
        StringBuilder sb = new StringBuilder();
        appConfig.getList().forEach(x->{
            sb.append(x.getName());
            sb.append(" ");
            sb.append(x.getDescription());
            sb.append(" | ");

        });
        return sb.toString();
    }

    @GetMapping("/map")
    public String mapConfigs() {
        StringBuilder sb = new StringBuilder();
        appConfig.getMap().forEach((key, value)->{
            sb.append(key);
            sb.append("<br>");
            sb.append(value.getName());
            sb.append(" ");
            sb.append(value.getDescription());
            sb.append(" <br> ");

        });
        return sb.toString();
    }

    @GetMapping("/profileincludes")
    public String getProfileIncludesProperties() {
        return appConfig.getTestDb();
    }

}
