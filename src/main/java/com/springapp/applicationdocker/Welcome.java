package com.springapp.applicationdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String welcome(){
        return "Application running healthy..";
    }

}
