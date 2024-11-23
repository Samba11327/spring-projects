package com.example.SpringJDBC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/sayHi")
    public String sayHi(){
        return "Hello World";
    }
    @PostMapping("wellcome")
    public String wellcome()
    {
        return "wellcome to samba ";
    }
}