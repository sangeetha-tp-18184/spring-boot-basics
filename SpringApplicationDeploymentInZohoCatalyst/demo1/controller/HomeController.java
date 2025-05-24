package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // WILL RETURN PAGES SO WE NEED TO ADD RESPNSEBODY TAG TO RETRUN STRING

@RestController
public class HomeController
{
    @RequestMapping("/")
    public String greet()
    {
        return "Hello, World!";
    }

    @RequestMapping("/about")
    public String getContact()
    {
        return "My contact : 1234567890";
    }
}
