package com.test.springboot.jpa;

import com.test.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameIgnoreCaseAndId(String userName, Long id);
}
