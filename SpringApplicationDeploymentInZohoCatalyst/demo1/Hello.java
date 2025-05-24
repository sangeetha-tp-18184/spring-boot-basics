package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello
{
    @RequestMapping("/hell")
    public String greet()
    {
        return "Hello world spring";
    }
}
