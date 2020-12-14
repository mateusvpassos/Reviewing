package com.start.reviewing.endpoint.controller;


import com.start.reviewing.endpoint.exception.NotFoundException;
import com.start.reviewing.endpoint.model.Game;
import com.start.reviewing.endpoint.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> gameList(){

        return gameService.list();
    }

    @GetMapping("/{id}")
    public Game gameFind(@PathVariable Long id){
        try{
            return gameService.findById(id);
        }catch (NotFoundException exc){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Game Not Found!", exc);
        }
    }

    @PostMapping
    public Game gameSave(@RequestBody Game game){

        return gameService.save(game);
    }

    @DeleteMapping("/{id}")
    public Game gameDelete(@PathVariable Long id){
        try{
            return gameService.delete(id);
        }catch (NotFoundException exc){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Game Not Found!", exc);
        }
    }

    @PutMapping
    public Game gameEdit(@RequestBody Game game){

        return gameService.edit(game);
    }
}