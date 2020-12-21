package com.start.reviewing.endpoint.service;

import com.start.reviewing.endpoint.model.Game;
import com.start.reviewing.endpoint.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReviewServiceTest {
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private GameService gameService;
    @Autowired
    private UserService userService;

    //@Test
    public void save(){
        Review r = new Review();
        r.setStars((short) 5);
        r.setUser(userService.findById(1L));
        r.setGame(gameService.findById(1L));
        r.setDescription("Review Test");
        System.out.println(reviewService.save(r));
    }
    //@Test
    public void list(){
        //System.out.println(reviewService.list());
    }

    //@Test
    public void edit(){
        Review r = reviewService.findById(1L);
        r.setStars((short) 4);
        System.out.println(reviewService.edit(r));
    }

    //@Test
    public void delete(){
        Review r = reviewService.findById(1L);
        System.out.println(reviewService.delete(r.getId()));
    }
}
