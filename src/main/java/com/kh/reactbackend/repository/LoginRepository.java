package com.kh.reactbackend.repository;

import com.kh.reactbackend.dto.LoginDto;
import com.kh.reactbackend.entity.Login;

import java.util.Optional;

public interface LoginRepository {
    Login findId(String email);

}
