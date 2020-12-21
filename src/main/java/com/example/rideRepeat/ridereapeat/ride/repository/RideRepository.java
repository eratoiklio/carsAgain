package com.example.rideRepeat.ridereapeat.ride.repository;

import com.example.rideRepeat.ridereapeat.ride.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
