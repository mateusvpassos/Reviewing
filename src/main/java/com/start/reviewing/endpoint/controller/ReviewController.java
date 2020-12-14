package com.start.reviewing.endpoint.controller;


import com.start.reviewing.endpoint.exception.NotFoundException;
import com.start.reviewing.endpoint.model.Review;
import com.start.reviewing.endpoint.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> reviewList(){

        return reviewService.list();
    }

    @GetMapping("/{id}")
    public Review reviewFind(@PathVariable Long id){
        try{
            return reviewService.findById(id);
        }catch (NotFoundException exc){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Review Not Found!", exc);
        }
    }

    @PostMapping
    public Review reviewSave(@RequestBody Review review){

        return reviewService.save(review);
    }

    @DeleteMapping("/{id}")
    public Review reviewDelete(@PathVariable Long id){
        try{
            return reviewService.delete(id);
        }catch (NotFoundException exc){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Review Not Found!", exc);
        }
    }

    @PutMapping
    public Review reviewEdit(@RequestBody Review review){

        return reviewService.edit(review);
    }
}