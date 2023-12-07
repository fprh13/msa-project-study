package com.example.firstservice;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/first-service")
@RequiredArgsConstructor
public class FirstApi {

    // port 정보를 확인하는 법
    private final Environment env;

    @GetMapping("/welcome")
    public String fistRequest() {
        return "Hello? welcome, first-service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("first-request") String header) {
        log.info(header);
        return "Hello world in First Service";
    }

    @GetMapping("/check")
    public String check(HttpServletRequest request) {
        log.info("Server port={}",request.getServerPort());
        return String.format(
                "Hi, there. this is a message from First Service om PORT %s.",
                env.getProperty("local.server.port"));
    }

}
