package com.ejabrasilead.scheduling.adapters.out.repositories;

import com.ejabrasilead.scheduling.adapters.out.mappers.UserMapper;
import com.ejabrasilead.scheduling.domain.models.User;
import com.ejabrasilead.scheduling.domain.repositories.UserRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaUserRepositoryAdapter implements UserRepository {

    private final JpaUserRepository jpaRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpaRepository.findByEmail(email)
                .map(UserMapper::toDomain);
    }

    @Override
    public Optional<User> findById(String id) {
        return jpaRepository.findById(id)
                .map(UserMapper::toDomain);
    }
 
    @Override
    public void save(User user) {
        jpaRepository.save(UserMapper.toEntity(user));
    }

    @Override
    public void deleteById(String id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public void update(User user) {
        jpaRepository.save(UserMapper.toEntity(user));
    }
}
