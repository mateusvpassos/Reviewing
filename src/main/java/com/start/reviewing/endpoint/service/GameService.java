package com.start.reviewing.endpoint.service;

import com.start.reviewing.endpoint.exception.NotFoundException;
import com.start.reviewing.endpoint.model.Game;
import com.start.reviewing.endpoint.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Game findById(Long id){
        Optional<Game> game = gameRepository.findById(id);
        if(game.isEmpty()){
            throw new NotFoundException();
        }
        return game.get();
    }

    public ResponseEntity<?> list(Pageable pageable){
        return new ResponseEntity<>(gameRepository.findAll(pageable), HttpStatus.OK);
    }

    public Game save(Game game){

        return gameRepository.save(game);
    }

    public Game delete(Long id){
        Optional<Game> game = gameRepository.findById(id);
        if(game.isEmpty()){
            throw new NotFoundException();
        }
        gameRepository.delete(game.get());
        return game.get();
    }

    public Game edit(Game game){

        return gameRepository.save(game);
    }
}