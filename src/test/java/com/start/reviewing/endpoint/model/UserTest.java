package com.start.reviewing.endpoint.model;

import com.start.reviewing.endpoint.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class UserTest {

    //@Test
    public void test(){
        User u = new User();
        u.setName("Mateus");
        u.setCountry("Brazil");
        u.setDate(LocalDate.now());
        u.setEmail("mviniciusdospassos@gmail.com");
        u.setPassword("12345");
        System.out.println(u.toString());
    }
}
