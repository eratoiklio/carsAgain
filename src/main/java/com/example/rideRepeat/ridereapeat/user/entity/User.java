package com.example.rideRepeat.ridereapeat.user.entity;

import com.example.rideRepeat.ridereapeat.ride.entity.Ride;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    @Builder.Default
    @ManyToMany
    @JoinTable(name="user_ride",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="ride_id"))
    private Set<Ride> ridesAsPassenger = new HashSet<>();
    @Builder.Default
    @OneToMany(mappedBy = "owner", cascade = CascadeType.PERSIST)
    private Set<Ride> ridesAsOwner = new HashSet<>();
    public void addOwnerRide(Ride ride) {
        ride.setOwner(this);
        this.ridesAsOwner.add(ride);
    }
    public User(){

    }
}