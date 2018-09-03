package com.test.springboot.rest;

import com.test.springboot.base.BaseRestApiTest;
import com.test.springboot.domain.User;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRestApiTest extends BaseRestApiTest {

    @Test
    public void test_should_get_user_of_young() {
        ResponseEntity<User> response = this.getTemplate().getForEntity("/users/user", User.class);
        User young  = response.getBody();
        assertThat(young.getUsername()).isEqualToIgnoringCase("young");
        assertThat(young.getAge()).isEqualTo(18);
    }

}
