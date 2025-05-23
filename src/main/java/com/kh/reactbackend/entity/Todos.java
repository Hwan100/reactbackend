package com.kh.reactbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comments;
import org.hibernate.engine.internal.Cascade;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Todos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PK;

    private Long num;
    private String text;
    private Boolean completed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id", nullable = false)
    private Users users;

    @PrePersist
    public void prePersist() {
        this.completed = false;
    }
}
