package com.ao.projectoweb.Condutor;

import com.ao.projectoweb.ComponentesDoCondutor.CartaDeConducao;
import com.ao.projectoweb.ComponentesDoCondutor.Contacto;
import com.ao.projectoweb.ComponentesDoCondutor.Endereco;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "TB_MOTORISTA")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Motorista extends Condutor implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String numeroCNH;
    private String categoriaCNH;
    private LocalDate validadeCNH;
    private LocalDateTime dataCadastro;

    public Motorista(){}
    public Motorista(String numeroCNH, String categoriaCNH, LocalDate validadeCNH,LocalDateTime dataCadastro) {
        this.numeroCNH = numeroCNH;
        this.categoriaCNH = categoriaCNH;
        this.validadeCNH = validadeCNH;
        this.dataCadastro = dataCadastro;
    }

    public Motorista(String nome,String sobrenome, String genero, LocalDate dataNascimento, Endereco endereco, CartaDeConducao cartaDeConducao, Contacto contacto, String numeroCNH, String categoriaCNH, LocalDate validadeCNH,LocalDateTime dataCadastro) {
        super(nome,sobrenome, genero, dataNascimento, endereco, cartaDeConducao, contacto);
        this.numeroCNH = numeroCNH;
        this.categoriaCNH = categoriaCNH;
        this.validadeCNH = validadeCNH;
        this.dataCadastro = dataCadastro;
    }
}

