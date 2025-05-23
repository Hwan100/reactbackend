package com.kh.reactbackend.repository;

import com.kh.reactbackend.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Users> findAll() {
        return em.createQuery("select u from Users u", Users.class).getResultList();
    }
}
