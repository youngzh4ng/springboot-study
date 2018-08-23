package com.test.springboot.service.impl;

import com.test.springboot.domain.InternalUserProfile;
import com.test.springboot.domain.User;
import com.test.springboot.jpa.InternalUserProfileRepository;
import com.test.springboot.jpa.UserRepository;
import com.test.springboot.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SaveServiceImpl implements SaveService {

    private UserRepository userRepository;

    private InternalUserProfileRepository internalUserProfileRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setInternalUserProfileRepository(InternalUserProfileRepository internalUserProfileRepository) {
        this.internalUserProfileRepository = internalUserProfileRepository;
    }


    @Override
    public void saveUser(String userId) {
        User user = new User();
        user.setUsername(userId);
        user.setBirthday(new Date());
        user.setAge(1);
        user.setEmail(userId + "@oocl.com");
        userRepository.save(user);
    }

    @Override
    public void saveInternalUserProfile(String userId) {
        InternalUserProfile internalUserProfile = new InternalUserProfile();
        internalUserProfile.setUserId(userId);
        internalUserProfile.setEnglishName(userId + "Name");
        internalUserProfileRepository.save(internalUserProfile);
    }

}
