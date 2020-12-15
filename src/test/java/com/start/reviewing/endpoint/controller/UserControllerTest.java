package com.start.reviewing.endpoint.controller;

import com.start.reviewing.endpoint.model.User;
import com.start.reviewing.endpoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserController userController;

    //@Test
    public void save(){
        User u = new User();
        u.setName("Mateus");
        u.setCountry("Brazil");
        u.setDate(LocalDate.now());
        u.setEmail("mviniciusdospassos@gmail.com");
        u.setPassword("12345");
        System.out.println(userController.userSave(u));
    }
    //@Test
    public void list(){
        System.out.println(userController.userList());
    }

    //@Test
    public void edit(){
        User u = userController.userFind(1L);
        u.setCountry("USA");
        System.out.println(userController.userEdit(u));
    }

    //@Test
    public void delete(){
        User u = userController.userFind(1L);
        System.out.println(userController.userDelete(u.getId()));
    }
}
