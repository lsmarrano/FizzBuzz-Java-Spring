package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

    }

    @RequestMapping("/fizzbuzzentries={numbers}")
    @ResponseBody
    public String[] fizzbuzz(@PathVariable String[] numbers) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        return fizzBuzz.toFizzBuzz(numbers);
    }
}
