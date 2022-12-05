package cn.devzhou.security.jwt.controller;

import cn.devzhou.security.jwt.annotations.Authorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String index(){
        return "Sin jwt";
    }

    @Authorize
    @GetMapping("/WeatherForecast/Get")
    public String api(){
        return "[\"Item 1\", \"Item 2\", \"Item 3\", \"Item 4\", \"Item 5\"]";
    }
}
