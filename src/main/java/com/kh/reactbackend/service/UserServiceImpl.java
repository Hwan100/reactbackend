package com.kh.reactbackend.service;

import com.kh.reactbackend.dto.UserDto;
import com.kh.reactbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDto.Response> findAllUsers() {
        return userRepository.findAll().stream().map(UserDto.Response::toDto).collect(Collectors.toList());
    }
}
