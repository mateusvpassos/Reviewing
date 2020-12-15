package com.start.reviewing.endpoint.service;

import com.start.reviewing.endpoint.model.Game;
import com.start.reviewing.endpoint.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    //@Test
    public void save(){
        User u = new User();
        u.setName("Mateus");
        u.setCountry("Brazil");
        u.setDate(LocalDate.now());
        u.setEmail("mviniciusdospassos@gmail.com");
        u.setPassword("12345");
        System.out.println(userService.save(u));
    }
    //@Test
    public void list(){
        System.out.println(userService.list());
    }

    //@Test
    public void edit(){
        User u = userService.findById(1L);
        u.setCountry("USA");
        System.out.println(userService.edit(u));
    }

    //@Test
    public void delete(){
        User u = userService.findById(1L);
        System.out.println(userService.delete(u.getId()));
    }
}
