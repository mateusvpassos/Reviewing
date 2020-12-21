package com.start.reviewing.endpoint.repository;


import com.start.reviewing.endpoint.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    //List<Review> listByUser (String userName);
}