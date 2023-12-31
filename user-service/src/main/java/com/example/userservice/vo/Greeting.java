package com.example.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
//@AllArgsConstructor
//@NoArgsConstructor
public class Greeting {

    @Value("${greeting.message}")
    private String message;

}
