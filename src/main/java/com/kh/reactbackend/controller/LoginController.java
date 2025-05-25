package com.kh.reactbackend.controller;

import com.kh.reactbackend.dto.LoginDto;
import com.kh.reactbackend.dto.UserDto;
import com.kh.reactbackend.entity.Login;
import com.kh.reactbackend.service.LoginService;
import com.kh.reactbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<LoginDto.Create> login(@RequestBody LoginDto.Create loginDto) {
        return ResponseEntity.ok(loginService.findLogin(loginDto));
    }

}
