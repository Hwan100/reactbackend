package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.LoginDto;
import com.kh.reactbackend.entity.Login;

public interface LoginService {

    LoginDto.Create findLogin(LoginDto.Create loginDto);

}
