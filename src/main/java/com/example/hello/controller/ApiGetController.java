package com.example.hello.controller;

import com.example.hello.domain.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class ApiGetController {

    @GetMapping(path = "/hello")
    public String getHello(){
        return "get Hello";
    }

//    @RequestMapping("/hi")  //get / post / put / delete
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : " + pathName);
        return "hello !!" + pathName;
    }

    // http://localhost:8080/api/get/query-param?user=seungjae&email=ksj84@kakao.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + email + age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest request){
        System.out.println(request.getName());
        System.out.println(request.getEmail());
        System.out.println(request.getAge());
        return request.getName() + request.getEmail() + request.getAge();
    }

}
