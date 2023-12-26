package com.ao.projectoweb.Config;

import com.ao.projectoweb.ComponentesDoVeiculo.Motor;
import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;
import com.ao.projectoweb.Service.CarroService;
import com.ao.projectoweb.Service.FrotasVeicularService;
import com.ao.projectoweb.Veiculos.Carro;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrotasConfig {
    @Autowired
    FrotasVeicularService frotasVeicularService;
    @PostConstruct
    public void initFrotaVeicular(){
        if(frotasVeicularService.findAll().isEmpty()){
            frotasVeicularService.save(new FrotasVeicular("Frotas Manuel"));
        }

    }
}
