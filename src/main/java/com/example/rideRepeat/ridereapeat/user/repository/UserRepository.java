package com.example.rideRepeat.ridereapeat.user.repository;

import com.example.rideRepeat.ridereapeat.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
