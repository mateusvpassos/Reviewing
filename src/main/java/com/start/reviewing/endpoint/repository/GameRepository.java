package com.start.reviewing.endpoint.repository;


import com.start.reviewing.endpoint.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    Game findByName(String name);
    Game findByPublisher(String publisher);
}