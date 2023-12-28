package com.ao.projectoweb.ComponentesDaPessoa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_CONTACTO")
@Getter
@Setter
public class Contacto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String telefone1;
    private String telefone2;
    private String numeroDeEmergencia;
    private String email;
    public Contacto(){}
    public Contacto(String telefone1, String telefone2, String numeroDeEmergencia, String email) {
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.numeroDeEmergencia = numeroDeEmergencia;
        this.email = email;
    }
}
