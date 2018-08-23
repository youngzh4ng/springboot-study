package com.test.springboot.base;

import com.test.springboot.component.MyBean;
import com.test.springboot.jooq.service.UserJooqService;
import com.test.springboot.service.SaveService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public abstract class MVCTestBase {

    @MockBean
    private MyBean myBean;

    @MockBean
    private UserJooqService userJooqService;

    @MockBean
    private SaveService saveService;

    @MockBean
    private JavaMailSender javaMailSender;

}
