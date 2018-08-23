package com.test.springboot.jpa;

import com.test.springboot.component.MyBean;
import com.test.springboot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
@Import(MyBean.class)
@Rollback
public class UserRepositoryIntTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test_should_add_user() {
        Date now = new Date();
        User user = new User();
        user.setBirthday(now);
        user.setEmail("test@oocl.com");
        user.setAge(100);
        user.setUsername("username");
        user.setPhone("13800138000");

        User persistedUser = userRepository.saveAndFlush(user);

        User dbUser = testEntityManager.find(User.class, persistedUser.getId());
        assertThat(dbUser).isNotNull();
        assertThat(dbUser).isEqualToComparingFieldByField(user);

    }

}
