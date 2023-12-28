package com.ao.projectoweb.Veiculos;


import com.ao.projectoweb.ComponentesDoVeiculo.Pneu;
import com.ao.projectoweb.Pessoa.Motorista;
import com.ao.projectoweb.Interfaces.IMotorista;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_BYCICLE")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Bicicleta extends Veiculo implements IMotorista,Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int nMarchas;
    private String freio;
    private boolean suspensaoDianteira;
    @OneToOne
    private Motorista motorista;
    public Bicicleta(){
    }
    public Bicicleta(int nMarchas, String freio, boolean suspensaoDianteira) {
        this.nMarchas = nMarchas;
        this.freio = freio;
        this.suspensaoDianteira = suspensaoDianteira;
    }

    public Bicicleta(String modelo, String marca, String ano, Pneu pneu, int nMarchas, String freio, boolean suspensaoDianteira, LocalDateTime dataCadastro) {
        super(modelo, marca, ano, pneu,dataCadastro);
        this.nMarchas = nMarchas;
        this.freio = freio;
        this.suspensaoDianteira = suspensaoDianteira;
    }

    @Override
    public void associarMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public void desassociarMotorista() {
        this.motorista = null;
    }
}
