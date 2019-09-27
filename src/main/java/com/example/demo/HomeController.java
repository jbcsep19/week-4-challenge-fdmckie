package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String startPage(){
        return "home";
    }


    @RequestMapping("/home")
    public String homePage() {
        return "home";
    }


    @RequestMapping("/blogauthor")
    public String blogAuthor() {
        return "blogauthor";
    }


    @RequestMapping("/blogentry")
    public String blogEntry() {
        return "blogentry";
    }


    @RequestMapping("/aboutbootcamp")
    public String aboutBootcamp(){
        return "aboutbootcamp";
    }


}
