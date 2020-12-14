package com.start.reviewing.endpoint.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping
    public String status(){
        return "OK ";
    }
}