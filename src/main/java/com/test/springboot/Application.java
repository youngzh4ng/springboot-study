package com.test.springboot;

import com.test.springboot.component.MyBean;
import com.test.springboot.listener.event.MyEvent;
import com.test.springboot.validator.property.SecurityValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Bean
    public static Validator configurationPropertiesValidator() {
        return new SecurityValidator();
    }

    public MyBean getMyBean() {
        return myBean;
    }

    @Autowired
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    private MyBean myBean;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
//        app.setWebApplicationType(WebApplicationType.REACTIVE);
        app.setAddCommandLineProperties(false);
        ConfigurableApplicationContext context = app.run(args);
        ApplicationEvent event = new MyEvent(new Object());
        System.out.println("Send Event: " + event.getClass());
        context.publishEvent(event);
    }
}
