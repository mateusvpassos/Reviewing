package com.start.reviewing.endpoint.service;

import com.start.reviewing.endpoint.exception.NotFoundException;
import com.start.reviewing.endpoint.model.Review;
import com.start.reviewing.endpoint.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review findById(Long id){
        Optional<Review> review = reviewRepository.findById(id);
        if(review.isEmpty()){
            throw new NotFoundException();
        }
        return review.get();
    }

    public List<Review> list(){
        return reviewRepository.findAll();
    }

    public Review save(Review review){

        return reviewRepository.save(review);
    }

    public Review delete(Long id){
        Optional<Review> review = reviewRepository.findById(id);
        if(review.isEmpty()){
            throw new NotFoundException();
        }
        reviewRepository.delete(review.get());
        return review.get();
    }

    public Review edit(Review review){

        return reviewRepository.save(review);
    }
}