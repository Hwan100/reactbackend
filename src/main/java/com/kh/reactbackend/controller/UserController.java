package com.kh.reactbackend.controller;

import com.kh.reactbackend.dto.UserDto;
import com.kh.reactbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    //회원 조회
    @GetMapping
    public ResponseEntity<List<UserDto.Response>> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
