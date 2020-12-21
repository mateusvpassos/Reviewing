package com.start.reviewing.endpoint.controller;

import com.start.reviewing.endpoint.model.Game;
import com.start.reviewing.endpoint.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@SpringBootTest
public class GameControllerTest {
    @Autowired
    private GameController gameController;

    //@Test
    public void save(){
        Game g = new Game(null, "Hades", "Supergiant", (short) 2020);
        System.out.println(gameController.gameSave(g));
    }
    //@Test
    public void list(){
        //System.out.println(gameController.gameList();
    }

    //@Test
    public void edit(){
        Game g = gameController.gameFind(1L);
        g.setPublisher("SuperGiant");
        System.out.println(gameController.gameEdit(g));
    }

    //@Test
    public void delete(){
        Game g = gameController.gameFind(1L);
        System.out.println(gameController.gameDelete(g.getId()));
    }
}
