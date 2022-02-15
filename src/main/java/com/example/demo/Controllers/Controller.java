package com.example.demo.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class Controller {
    // 3.1
    @GetMapping("/endpoint")
    public String hello() {
        return "Hello World";
    }
    // 3.2
    @GetMapping("/parameterEndpoint")
    public String hello2(@RequestParam String input) {
        return "The input was " + input;
    }
    // 3.3 (Kom ikke langt)
    /*@GetMapping("/fredag")
    public String erDetFredag() {

    }*/
}
