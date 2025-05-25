package com.kh.reactbackend.repository;

import com.kh.reactbackend.dto.UserDto;
import com.kh.reactbackend.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Users> findAll() {
        return em.createQuery("select u from Users u", Users.class).getResultList();
    }

    @Override
    public Optional<Users> findOne(Long id) {
        return Optional.ofNullable(em.find(Users.class, id));
    }
}
