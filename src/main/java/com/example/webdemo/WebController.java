package com.example.webdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class WebController {
//
//    @Autowired
//    private WebService webService;
//
//    @GetMapping("")
//    public String homepage() {
//        return webService.covenant();
//    }
//}

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "<a href=\"https://covenant.tistory.com/\">covenant.tistory.com/</a>";
    }
}