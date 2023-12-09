package com.example.userservice.service;

import com.example.userservice.service.dto.UserDto;

import static com.example.userservice.service.dto.UserDto.*;

public interface UserService {

    /**
     * create
     */
    JoinDto join(JoinDto joinDto);
}
