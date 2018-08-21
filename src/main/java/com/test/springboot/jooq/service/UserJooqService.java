package com.test.springboot.jooq.service;

import com.test.springboot.jooq.data.jooq.tables.pojos.TestUser;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.test.springboot.jooq.data.jooq.Tables.TEST_USER;

@Component
public class UserJooqService {

    @Autowired
    public UserJooqService(DSLContext dslContext) {
        this.create = dslContext;
    }

    private final DSLContext create;

    public List<TestUser> userYoungerThan(Short age) {
        return this.create.selectFrom(TEST_USER)
                .where(TEST_USER.AGE.lessThan(age)).fetchInto(TestUser.class);
    }

}
