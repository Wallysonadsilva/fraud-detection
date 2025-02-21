package com.antifraud.fraud_detection.repository;

import com.antifraud.fraud_detection.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// This allows finding user by username for Authentication
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
