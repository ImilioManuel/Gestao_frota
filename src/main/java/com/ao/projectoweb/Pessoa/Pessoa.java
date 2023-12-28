package com.ao.projectoweb.Pessoa;


import com.ao.projectoweb.ComponentesDaPessoa.Contacto;
import com.ao.projectoweb.ComponentesDaPessoa.Endereco;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public abstract class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String sobrenome;
    private String genero;
    private LocalDate dataNascimento;
    @OneToOne
    private Endereco endereco;
    @OneToOne
    private Contacto contacto;
    public Pessoa(){}
    public Pessoa(String nome, String sobrenome, String genero, LocalDate dataNascimento, Endereco endereco, Contacto contacto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contacto = contacto;
    }
}
