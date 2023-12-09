package com.example.userservice.service;

import com.example.userservice.domain.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.example.userservice.service.dto.UserDto.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    /**
     * create
     */
    @Override
    public JoinDto join(JoinDto joinDto) {
        joinDto.setUserId(UUID.randomUUID().toString());
        // TODO: 회원가입 로직 추가 할 것
        return null;
    }
}

