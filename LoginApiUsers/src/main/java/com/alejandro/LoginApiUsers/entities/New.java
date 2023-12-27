package com.alejandro.LoginApiUsers.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class New {

    @Id
    private Long idNew;
    @Column(nullable = false, unique = true, length = 500, columnDefinition = "TEXT")
    private String newTitle;
    @Column(nullable = false, unique = true, columnDefinition = "LONGTEXT")
    private String newBody;
    private LocalDate creationDate;
    @ManyToOne
    private Journalist journalist;

    public New(String newTitle, String newBody, LocalDate creationDate, Journalist journalist) {
        this.newTitle = newTitle;
        this.newBody = newBody;
        this.creationDate = creationDate;
        this.journalist = journalist;
    }
}