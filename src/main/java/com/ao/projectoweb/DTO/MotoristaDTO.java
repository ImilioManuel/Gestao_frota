package com.ao.projectoweb.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
public class MotoristaDTO {
    private String nome;
    private String Sobrenome;
    private String genero;
    private int dia;
    private int mes;
    private int ano;
    private String bairro;
    private String Municipio;
    private String Provincia;
    private String numeroCarteira;
    private String categoriaCarteira;
    private String dataEmissaoCarteira;
    private String dataValidadeCarteira;
    private boolean habilitacaoAtiva;
    private String telefone1;
    private String telefone2;
    private String numeroDeEmergencia;
    private String email;
    private String numeroCNH;
    private String categoriaCNH;
    private int diaCNH;
    private int mesCNH;
    private int anoCNH;

    public LocalDate getDataMotorista(){
        return LocalDate.of(this.ano,this.mes,this.dia);
    }
    public LocalDate getDataValidadeCNH(){
        return LocalDate.of(this.anoCNH,this.mesCNH,this.diaCNH);
    }
}
