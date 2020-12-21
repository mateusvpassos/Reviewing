package com.start.reviewing.endpoint.service;

import com.start.reviewing.endpoint.exception.NotFoundException;
import com.start.reviewing.endpoint.model.User;
import com.start.reviewing.endpoint.repository.UserRepository;
import com.start.reviewing.endpoint.util.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new NotFoundException();
        }
        return user.get();
    }

    public ResponseEntity<?> list(Pageable pageable){
        return new ResponseEntity<>(userRepository.findAll(pageable), HttpStatus.OK);
    }

    public User save(User user){
        user.setDate(LocalDate.now());
        user.setPassword(PasswordEncoder.encoding(user.getPassword()));
        return userRepository.save(user);
    }

    public User delete(Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new NotFoundException();
        }
        userRepository.delete(user.get());
        return user.get();
    }

    public User edit(User user){

        return userRepository.save(user);
    }
}