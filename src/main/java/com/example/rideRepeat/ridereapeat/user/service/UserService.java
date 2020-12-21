package com.example.rideRepeat.ridereapeat.user.service;

import com.example.rideRepeat.ridereapeat.ride.entity.Ride;
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
    public User addRideAsOwner(User user, Ride ride){
        User userFromDb = userRepository.getOne(user.getUserId());
        userFromDb.addOwnerRide(ride);
        return userFromDb;
    }
}
