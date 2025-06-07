package com.voyagerchat.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long city_id;

    private String name_rus;
    private String name_en;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

    private String websiteURL;

    private double latitude;
    private double longitude;

    private LocalDateTime dateOfCreated;

    @PrePersist
    private void init() {
        this.dateOfCreated = LocalDateTime.now();
    }

}
