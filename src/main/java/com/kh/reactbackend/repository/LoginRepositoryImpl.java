package com.kh.reactbackend.repository;

import com.kh.reactbackend.dto.LoginDto;
import com.kh.reactbackend.entity.Login;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PrePersist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Login findId(String email) {
        String query = "select l from Login l where l.email = :email";
        List<Login> logins = em.createQuery(query, Login.class)
                .setParameter("email", email)
                .getResultList();

        if (logins.isEmpty()) {
            return null;
        } else {
            return logins.get(0);
        }
    }
}
