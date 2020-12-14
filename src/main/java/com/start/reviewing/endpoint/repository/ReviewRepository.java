package com.start.reviewing.endpoint.repository;


import com.start.reviewing.endpoint.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}