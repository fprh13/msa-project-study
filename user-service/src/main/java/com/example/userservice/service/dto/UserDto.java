package com.example.userservice.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class UserDto {

    @Data
    @Builder
    @AllArgsConstructor
    public static class JoinDto {
        private String email;
        private String name;
        private String pwd;
        private String userId;
        private Data createdAt;
        private String encryptedPwd;
    }



}
