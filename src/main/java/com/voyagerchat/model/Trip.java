package com.voyagerchat.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Nullable
    private String name;

    @ManyToOne
    private User user;

    @OneToMany
    private List<Place> places;


}
