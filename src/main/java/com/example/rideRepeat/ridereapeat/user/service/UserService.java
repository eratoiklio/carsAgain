package com.example.rideRepeat.ridereapeat.user.service;

import com.example.rideRepeat.ridereapeat.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
}
