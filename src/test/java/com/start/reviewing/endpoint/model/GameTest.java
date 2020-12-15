package com.start.reviewing.endpoint.model;

import com.start.reviewing.endpoint.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameTest {

    //@Test
    public void test(){
        Game g = new Game(null, "Hades", "Supergiant", (short) 2020);
        System.out.println(g.toString());
    }
}
