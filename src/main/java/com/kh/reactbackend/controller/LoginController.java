package com.kh.reactbackend.controller;

import com.kh.reactbackend.service.LoginService;
import com.kh.reactbackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;


}
