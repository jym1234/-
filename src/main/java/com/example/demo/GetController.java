package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private GreetingService gs;

    @GetMapping("/greeting")
    public String sayHi(@RequestParam String name) {
        return name;
    }

    @GetMapping("/greeting/{one}/{two}/{three}")
    public String sayHi1(@PathVariable(value = "one") String one, @PathVariable(value = "two") String two, @PathVariable(value = "three") String three) {
        return gs.sayHi(one, two, three);
    }
}
