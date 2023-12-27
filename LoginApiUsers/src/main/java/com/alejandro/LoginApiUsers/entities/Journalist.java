package com.alejandro.LoginApiUsers.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public final class Journalist extends DefaultUser{

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "journalist")
    private List<New> newList;
    private Long monthlySalary;

    public Journalist(String name, String surname, String email, String password, Role role, Long monthlySalary) {
        super(name, surname, email, password, role);
        this.monthlySalary = monthlySalary;
    }
}
