package com.antifraud.fraud_detection.service;

import com.antifraud.fraud_detection.model.User;
import com.antifraud.fraud_detection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(String username, String password, Set<String> roles){
        String hashedPassword = passwordEncoder.encode(password);
        User user = new User(null, username, hashedPassword, roles);
        return userRepository.save(user);
    }
}
