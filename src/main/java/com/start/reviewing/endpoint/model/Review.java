package com.start.reviewing.endpoint.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Short stars;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Game game;
    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;
    @Column(nullable = false, length = 200)
    private String description;
}