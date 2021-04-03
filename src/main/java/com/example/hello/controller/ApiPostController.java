package com.example.hello.controller;

import com.example.hello.domain.PostRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
public class ApiPostController {

    @PostMapping("/view")
    public void post(Map<String, Object> requestData){

        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });

    }

    @PostMapping("/view02")
    public void post02(PostRequest requestData){

        System.out.println(requestData);

    }

}
