package com.start.reviewing.endpoint.controller;


import com.start.reviewing.endpoint.exception.NotFoundException;
import com.start.reviewing.endpoint.model.User;
import com.start.reviewing.endpoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
//    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> userList(Pageable pageable){
        return new ResponseEntity<>(userService.list(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
    public User userFind(@PathVariable Long id){
        try{
            return userService.findById(id);
        }catch (NotFoundException exc){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found!", exc);
        }
    }

    @PostMapping
    public User userSave(@RequestBody User user){

        return userService.save(user);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('ADMIN')")
    public User userDelete(@PathVariable Long id){
        try{
            return userService.delete(id);
        }catch (NotFoundException exc){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found!", exc);
        }
    }

    @PutMapping
    public User userEdit(@RequestBody User user){

        return userService.edit(user);
    }
}