package com.example.rideRepeat.ridereapeat.user.service;

import com.example.rideRepeat.ridereapeat.user.entity.User;
import com.example.rideRepeat.ridereapeat.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }
}
