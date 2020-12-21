package com.example.rideRepeat.ridereapeat;

import com.example.rideRepeat.ridereapeat.ride.entity.Ride;
import com.example.rideRepeat.ridereapeat.ride.service.RideService;
import com.example.rideRepeat.ridereapeat.user.entity.User;
import com.example.rideRepeat.ridereapeat.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    private final UserService userService;
    private final RideService rideService;
    public Config( UserService userService, RideService rideService){
        this.rideService=rideService;
        this.userService=userService;

        User user= User.builder()
                .firstName("ada")
                .build();
        Ride ride = Ride.builder()
                .from("Warszawa")
                .to("Legionowo")
                .build();


    }

}
