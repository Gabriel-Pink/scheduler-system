package com.ejabrasilead.scheduling.adapters.out.mappers;

import com.ejabrasilead.scheduling.adapters.out.entities.UserEntity;
import com.ejabrasilead.scheduling.domain.models.User;

public class UserMapper {

    public static UserEntity toEntity(User user) {
        return new UserEntity(user.getId(), user.getUsername(), user.getPassword(), user.getEmail(), user.getRole());
    }

    public static User toDomain(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail(), userEntity.getRole());
    }
    
}
