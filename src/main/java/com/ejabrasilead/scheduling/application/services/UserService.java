package com.ejabrasilead.scheduling.application.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ejabrasilead.scheduling.domain.models.User;
import com.ejabrasilead.scheduling.domain.repositories.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public void createUser(User user) {

        

        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.update(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

}
