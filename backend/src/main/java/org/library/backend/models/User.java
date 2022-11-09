package org.library.backend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "Użytkownik")
public class User {

    @Getter
    @Setter
    @Id
    @Column(name = "UżytkownikID", nullable = false)
    private int id;

    @Getter
    @Setter
    @Column(name = "Email")
    @Email
    private String email;

    @Getter
    @Setter
    @Column(name = "Admin")
    private boolean admin;

    @Getter
    @Setter
    @Column(name = "Imie")
    private String imie;

    @Getter
    @Setter
    @Column(name = "Nazwisko")
    private String nazwisko;

    @Getter
    @Setter
    @Column(name = "Telefon")
    private String telefon;
}
