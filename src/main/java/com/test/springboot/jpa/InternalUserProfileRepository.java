package com.test.springboot.jpa;

import com.test.springboot.domain.InternalUserProfile;
import org.bson.types.ObjectId;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InternalUserProfileRepository extends MongoRepository<InternalUserProfile, ObjectId> {

    @Cacheable(value = "InternalUserProfile", key = "#userId")
    InternalUserProfile findOneByUserIdIgnoreCase(String userId);

}
