package com.kh.reactbackend.service;

import com.kh.reactbackend.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class LoginServiceImpl implements LoginService {
    private final LoginRepository loginRepository;
}
