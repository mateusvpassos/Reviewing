package com.start.reviewing.endpoint.service;

import com.start.reviewing.endpoint.model.Game;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameServiceTest {
    @Autowired
    private GameService gameService;

    //@Test
    public void save(){
        Game g = new Game(null, "Hades", "Supergiant", (short) 2020);
        System.out.println(gameService.save(g));
    }
    //@Test
    public void list(){
        System.out.println(gameService.list());
    }

    //@Test
    public void edit(){
        Game g = gameService.findById(1L);
        g.setPublisher("SuperGiant");
        System.out.println(gameService.edit(g));
    }

    //@Test
    public void delete(){
        Game g = gameService.findById(1L);
        System.out.println(gameService.delete(g.getId()));
    }
}
