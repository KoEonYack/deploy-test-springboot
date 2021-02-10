package com.example.webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main() {
        String html = "<a href=\"https://covenant.tistory.com/\">covenant.tistory.com/</a><br />";
        html += "<a href=\"https://11st.co.kr/\">11st.co.kr</a>";
        return html;
    }
}