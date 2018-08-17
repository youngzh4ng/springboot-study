package com.test.springboot.controller;

import com.test.springboot.domain.User;
import com.test.springboot.exception.UserException;
import com.test.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

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

}
