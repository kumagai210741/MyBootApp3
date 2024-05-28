package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* Hello world!
*/
@RestController
public class MyBootApp3
{
    @RequestMapping("/")
    public String index() {
    return "Taro desu!";
    }
    @RequestMapping("/miyagi")
    public String miyagi() {
    return "Miyagi desu!";
    }
}
