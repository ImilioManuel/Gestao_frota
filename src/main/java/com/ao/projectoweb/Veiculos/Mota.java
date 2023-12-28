package com.ao.projectoweb.Veiculos;


import com.ao.projectoweb.ComponentesDoVeiculo.Motor;
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
@Table(name = "TB_MOTA")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Mota extends Veiculo implements IMotorista,Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int cilindro;
    private String guidao;
    private boolean partidaElectrica;
    @OneToOne
    private Motor motor;
    @OneToOne
    private Motorista motorista;
    public Mota(){

    }

    public Mota(int cilindro, String guidao, boolean partidaElectrica, Motor motor) {
        this.cilindro = cilindro;
        this.guidao = guidao;
        this.partidaElectrica = partidaElectrica;
        this.motor = motor;
    }

    public Mota(String modelo, String marca, String ano, Pneu pneu, LocalDateTime dataCadastro, int cilindro, String guidao, boolean partidaElectrica, Motor motor) {
        super(modelo, marca, ano, pneu,dataCadastro);
        this.cilindro = cilindro;
        this.guidao = guidao;
        this.partidaElectrica = partidaElectrica;
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
