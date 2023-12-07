package com.example.secondservice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/second-service")
@RequiredArgsConstructor
public class SecondApi {

    private final Environment env;

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
        log.info("Server port={}",env.getProperty("local.server.port"));
        return String.format(
                "Hi, there. this is a message from second Service om PORT %s.",
                env.getProperty("local.server.port"));
    }

}
