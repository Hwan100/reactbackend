package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.LoginDto;
import com.kh.reactbackend.entity.Login;
import com.kh.reactbackend.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Override
    public LoginDto.Create findLogin(LoginDto.Create loginDto) {
        Login login = loginRepository.findId(loginDto.getEmail());
        return LoginDto.Create.toDto(login);

    }
}
