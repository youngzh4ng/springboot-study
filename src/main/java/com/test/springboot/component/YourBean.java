package com.test.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class YourBean implements ApplicationRunner {

    //please add program arguments --debug logfile.txt
    @Autowired
    public YourBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        System.out.println(debug);
        System.out.println(args.getNonOptionArgs());
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("this is Application Runner. in YourBean");
    }
}
