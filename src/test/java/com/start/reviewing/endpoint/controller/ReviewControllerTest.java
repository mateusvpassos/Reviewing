package com.start.reviewing.endpoint.controller;

import com.start.reviewing.endpoint.model.Review;
import com.start.reviewing.endpoint.service.GameService;
import com.start.reviewing.endpoint.service.ReviewService;
import com.start.reviewing.endpoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReviewControllerTest {
    @Autowired
    private ReviewController reviewController;
    @Autowired
    private GameController gameController;
    @Autowired
    private UserController userController;

    //@Test
    public void save(){
        Review r = new Review();
        r.setStars((short) 5);
        r.setUser(userController.userFind(1L));
        r.setGame(gameController.gameFind(1L));
        r.setDescription("Review Test");
        System.out.println(reviewController.reviewSave(r));
    }
    //@Test
    public void list(){
        System.out.println(reviewController.reviewList());
    }

    //@Test
    public void edit(){
        Review r = reviewController.reviewFind(1L);
        r.setStars((short) 4);
        System.out.println(reviewController.reviewEdit(r));
    }

    //@Test
    public void delete(){
        Review r = reviewController.reviewFind(1L);
        System.out.println(reviewController.reviewDelete(r.getId()));
    }
}
