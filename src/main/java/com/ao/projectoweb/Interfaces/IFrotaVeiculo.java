package com.ao.projectoweb.Interfaces;

import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;

import java.util.UUID;

public interface IFrotaVeiculo {
    public Object addFrotaVeiculo(FrotasVeicular frotasVeicular, UUID idVeiculo);
}
