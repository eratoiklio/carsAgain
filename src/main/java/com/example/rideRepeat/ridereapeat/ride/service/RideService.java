package com.example.rideRepeat.ridereapeat.ride.service;

import com.example.rideRepeat.ridereapeat.ride.repository.RideRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideService {
    private final RideRepository rideRepository;

}
