package com.ao.projectoweb.ComponentesDaPessoa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;
@Entity
@Table(name = "TB_ENDERECO")
@Getter
@Setter
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String bairro;
    private String Municipio;
    private String Provincia;

    public Endereco() {
    }

    public Endereco(String bairro, String municipio, String provincia) {
        this.bairro = bairro;
        Municipio = municipio;
        Provincia = provincia;
    }
}
