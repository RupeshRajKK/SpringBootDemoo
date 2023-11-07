package com.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse("Hello", "Rupesh",
                List.of("java","python","dotNet"),
                new Person(27,"chennai",9042990447L));

        return response;
    }

    record Person(int age, String address, double mobNum){}
    record GreetResponse(String greet,
                         String name,
                         List<String> favProgramming,
                         Person details){} //used to return JSON response when calling into a method



//    @GetMapping
//    public GreetResponseNew greeting(){
//        return new GreetResponseNew("Rupesh");
//    }
//
//    record GreetResponseNew(String Name){}
}
