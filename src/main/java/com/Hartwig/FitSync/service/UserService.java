package com.Hartwig.FitSync.service;

import com.Hartwig.FitSync.model.User;
import com.Hartwig.FitSync.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public User registerUser(User user) {

        return userRepository.save(user);
    }

}
