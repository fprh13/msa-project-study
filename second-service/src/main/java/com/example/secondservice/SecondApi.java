package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/second-service")
public class SecondApi {

    @GetMapping("/welcome")
    public String secondRequest() {
        return "Hello? welcome, second-service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header) {
        log.info(header);
        return " Hello world in Second Service";
    }

    @GetMapping("/check")
    public String check() {
        return "Hi, there. this is a message from Second Service.";
    }

}
