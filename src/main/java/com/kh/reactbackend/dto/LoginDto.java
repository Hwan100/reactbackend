package com.kh.reactbackend.dto;

import com.kh.reactbackend.entity.Login;
import com.kh.reactbackend.entity.Users;
import jakarta.persistence.OneToOne;
import lombok.*;

public class LoginDto {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Builder
    public static class Create{
        private Long id;
        private String email;
        private String password;

        public static Create toDto(Login login) {
            return Create.builder()
                    .id(login.getId())
                    .email(login.getEmail())
                    .password(login.getPassword())
                    .build();
        }
    }
}
