package com.ejabrasilead.scheduling.adapters.out.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejabrasilead.scheduling.adapters.out.entities.UserEntity;

public interface JpaUserRepository extends JpaRepository<UserEntity, String> {
    Optional<UserEntity> findByEmail(String email);
}
