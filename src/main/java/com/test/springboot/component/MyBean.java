package com.test.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyBean implements ApplicationRunner {

    @Value("${com.test.name}")
    public String name;

    public int getIntValue() {
        return intValue;
    }

    @Value("${com.test.number}")
    public int intValue;

    //please add program arguments --debug logfile.txt
    @Autowired
    public MyBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        System.out.println(debug);
        System.out.println(args.getNonOptionArgs());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("this is Application Runner. in MyBean");
    }

    public String getName() {
        return name;
    }


}
