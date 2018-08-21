package com.test.springboot.controller;

import com.test.springboot.domain.User;
import com.test.springboot.exception.UserException;
import com.test.springboot.jooq.data.jooq.tables.pojos.TestUser;
import com.test.springboot.jooq.service.UserJooqService;
import com.test.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    private UserJooqService userJooqService;

    @Autowired
    public void setUserJooqService(UserJooqService userJooqService) {
        this.userJooqService = userJooqService;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    @ResponseBody
    public User getUser() {
        User user = new User("Young", 18);
        user.setBirthday(new Date());
        return user;
    }

    @GetMapping("/format")
    public String getFormat() {
        return "{\"name\": \"Young\"}";
    }

    @GetMapping("/error")
    public String error() throws UserException {
        throw new UserException("test");
    }

    @GetMapping("/secure")
    @ResponseBody
    public ResponseEntity<User> getUserSecured(@CookieValue("name") String nameCookie) {
        if ("young".equals(nameCookie)) {
            User user = this.getUser();
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>((User) null, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}/{userName}")
    public ResponseEntity<User> getUserByIdAndName(@PathVariable Long id, @PathVariable String userName) {
        User user = userRepository.findByUsernameIgnoreCaseAndId(userName, id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/younger/{age}")
    public ResponseEntity<List<TestUser>> getUserYoungerThan(@PathVariable Short age) {
        List<TestUser> users = userJooqService.userYoungerThan(age);
        System.out.println(users.size());
        TestUser user = users.get(0);
        System.out.println(user.getUsername());
        System.out.println(user.getBirthday());
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
