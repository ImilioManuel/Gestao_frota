package com.ao.projectoweb.Users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_USER")
@Getter
@Setter
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String username;
    private String BI;
    private String password;
    private UserType entidadeTipo;
    public User() {
    }
    public User(String nome, String username, String BI, String password, UserType entidadeTipo) {
        this.nome = nome;
        this.username = username;
        this.BI = BI;
        this.password = password;
        this.entidadeTipo = entidadeTipo;
    }
}
