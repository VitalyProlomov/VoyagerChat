package com.voyagerchat.service;

import com.voyagerchat.model.User;
import com.voyagerchat.model.enums.Role;
import com.voyagerchat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import org.springframework.security.crypto.password.PasswordEncoder;

@Service
@RequiredArgsConstructor
@Slf4j // logger
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public boolean createUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_USER);
        try {
            userRepository.save(user);
            log.info("User with email {} successfully saved", user.getEmail());
        } catch (Exception ex) {
            log.error("Could`nt save user due to error: " + ex.getMessage());
        }
        return true;
    }
//
//
//    User findByEmail(String email) {
//
//    }

//    User updateUserPlaces() {
//
//    }
}
