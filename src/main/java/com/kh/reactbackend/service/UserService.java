package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto.Response> findAllUsers();
    UserDto.Response getUserById(Long id);
}
