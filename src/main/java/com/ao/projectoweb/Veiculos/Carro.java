package com.ao.projectoweb.Veiculos;


import com.ao.projectoweb.ComponentesDoVeiculo.Motor;
import com.ao.projectoweb.ComponentesDoVeiculo.Pneu;
import com.ao.projectoweb.Condutor.Motorista;
import com.ao.projectoweb.Interfaces.IMotorista;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_CAR")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Carro extends Veiculo implements IMotorista,Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int nPortas;
    private String combustivel;
    private boolean arCondicionado;
    @OneToOne
    private Motor motor;
    @OneToOne
    private Motorista motorista;
    public Carro(){

    }
    public Carro(int nPortas, String combustivel, boolean arCondicionado, Motor motor) {
        this.nPortas = nPortas;
        this.combustivel = combustivel;
        this.arCondicionado = arCondicionado;
        this.motor = motor;
    }

    public Carro(String modelo, String marca, String ano, Pneu pneu, LocalDateTime dataCadastro,int nPortas, String combustivel, boolean arCondicionado, Motor motor) {
        super(modelo, marca, ano, pneu,dataCadastro);
        this.nPortas = nPortas;
        this.combustivel = combustivel;
        this.arCondicionado = arCondicionado;
        this.motor = motor;
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
