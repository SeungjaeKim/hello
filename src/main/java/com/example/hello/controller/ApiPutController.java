package com.example.hello.controller;

import com.example.hello.domain.PostRequest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiPutController {

    @PutMapping("/put")
    public void put(@RequestBody PostRequest request){
        System.out.println(request);
    }
}
