package com.kh.reactbackend.repository;

import com.kh.reactbackend.entity.Users;

import java.util.List;

public interface UserRepository {
    List<Users> findAll();
}
