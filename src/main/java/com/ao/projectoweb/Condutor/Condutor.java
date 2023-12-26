package com.ao.projectoweb.Condutor;

import com.ao.projectoweb.ComponentesDoCondutor.CartaDeConducao;
import com.ao.projectoweb.ComponentesDoCondutor.Contacto;
import com.ao.projectoweb.ComponentesDoCondutor.Endereco;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public abstract class Condutor implements Serializable {
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
    private CartaDeConducao cartaDeConducao;
    @OneToOne
    private Contacto contacto;
    public Condutor(){}
    public Condutor(String nome,String sobrenome, String genero, LocalDate dataNascimento, Endereco endereco, CartaDeConducao cartaDeConducao, Contacto contacto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cartaDeConducao = cartaDeConducao;
        this.contacto = contacto;
    }
}
