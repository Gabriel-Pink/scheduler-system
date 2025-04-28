package com.ejabrasilead.scheduling.domain.repositories;

import com.ejabrasilead.scheduling.domain.models.User;

import java.util.Optional;


public interface UserRepository {
    Optional<User> findByEmail(String email);
    Optional<User> findById(String id);
    void save(User user);
    void deleteById(String id);
    void update(User user);
}
