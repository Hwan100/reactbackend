package com.kh.reactbackend.repository;

import com.kh.reactbackend.entity.Users;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<Users> findAll();
    Optional<Users> findOne(Long id);
}
