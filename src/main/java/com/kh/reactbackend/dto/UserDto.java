package com.kh.reactbackend.dto;

import com.kh.reactbackend.entity.Users;
import lombok.*;

public class UserDto {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Builder
    public static class Response {
        private Long id;
        private String name;
        private String text;
        private String git;
        private String blog;
        private boolean status;

        public static Response toDto(Users users) {
            return Response.builder()
                    .id(users.getId())
                    .name(users.getName())
                    .text(users.getText())
                    .git(users.getGit())
                    .blog(users.getBlog())
                    .status(users.getStatus())
                    .build();
        }

    }
}
