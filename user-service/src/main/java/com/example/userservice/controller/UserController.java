package com.example.userservice.controller;

import com.example.userservice.service.UserService;
import com.example.userservice.service.UserServiceImpl;
import com.example.userservice.service.dto.UserDto;
import com.example.userservice.vo.Greeting;
import com.example.userservice.vo.RequestUser;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserServiceImpl userService;

//    private final Environment env;

    /**env가 아닌 yml 정의 문자열 받아 보는 법
     * 예시로 일단 주입 받아서 사용
     * **/
    private final Greeting greeting;

    @GetMapping("/heath_check")
    public String status() {
        return "It's working user-service welcome";
    }

    @GetMapping("/welcome")
    public String welcome() {
//        return env.getProperty("greeting.message");
        return greeting.getMessage();
    }

    /**
     * create
     */
    @GetMapping("/users")
    public ResponseEntity<?> join(@RequestBody UserDto.JoinDto joinDto) {
        // TODO: VO 객체를 이용하여 join 하는 것으로 수정 필요
        return ResponseEntity.status(HttpStatus.OK).body(userService.join(joinDto));
    }




}
