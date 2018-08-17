package com.test.springboot.repository;

import com.test.springboot.domain.User;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User, Long> {

    User findByUsernameIgnoreCaseAndId(String userName, Long id);
}
