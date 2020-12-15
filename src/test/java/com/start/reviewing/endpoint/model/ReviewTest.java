package com.start.reviewing.endpoint.model;

import com.start.reviewing.endpoint.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReviewTest {

    //@Test
    public void test(){
        Review r = new Review();
        r.setDescription("Best indie game of the year!!");
        r.setGame(null);
        r.setStars((short) 5);
        r.setUser(null);
        System.out.println(r.toString());
    }
}
