package com.example.rideRepeat.ridereapeat.ride.entity;

import com.example.rideRepeat.ridereapeat.user.entity.User;
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
@AllArgsConstructor
@Builder
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rideId;
    @Column(name="ride_from")
    private String from;
    private String to;
    @ManyToOne
    @JoinColumn
    private User owner;
    @Builder.Default
    @ManyToMany(mappedBy = "ridesAsPassenger")
    private Set<User> passengers = new HashSet<>();
    public Ride(){

    }

}
