package com.ao.projectoweb.Pessoa;

import com.ao.projectoweb.ComponentesDaPessoa.Condutor.CartaDeConducao;
import com.ao.projectoweb.ComponentesDaPessoa.Contacto;
import com.ao.projectoweb.ComponentesDaPessoa.Endereco;
import com.ao.projectoweb.Veiculos.Veiculo;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TB_MOTORISTA")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Motorista extends Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String numeroCNH;
    private String categoriaCNH;
    private LocalDate validadeCNH;
    private LocalDateTime dataCadastro;
    @OneToOne
    private CartaDeConducao cartaDeConducao;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "TB_MotoristaVeiculo", joinColumns = @JoinColumn(name = "id_motorista"))
    @Column(name = "id_veiculo",length = 500)
    List<Veiculo> veiculo;
    public Motorista(){}
    public Motorista(String numeroCNH, String categoriaCNH, LocalDate validadeCNH,LocalDateTime dataCadastro) {
        this.numeroCNH = numeroCNH;
        this.categoriaCNH = categoriaCNH;
        this.validadeCNH = validadeCNH;
        this.dataCadastro = dataCadastro;
    }

    public Motorista(String nome,String sobrenome, String genero, LocalDate dataNascimento, Endereco endereco, CartaDeConducao cartaDeConducao, Contacto contacto, String numeroCNH, String categoriaCNH, LocalDate validadeCNH,LocalDateTime dataCadastro) {
        super(nome,sobrenome, genero, dataNascimento, endereco, contacto);
        this.numeroCNH = numeroCNH;
        this.categoriaCNH = categoriaCNH;
        this.validadeCNH = validadeCNH;
        this.dataCadastro = dataCadastro;
        this.cartaDeConducao = cartaDeConducao;
    }
}

