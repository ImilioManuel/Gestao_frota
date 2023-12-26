package com.ao.projectoweb.Service;

import com.ao.projectoweb.ComponentesDoVeiculo.Pneu;
import com.ao.projectoweb.Repository.PneuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PneuService {
    @Autowired
    PneuRepository pneuRepository;

    public Object save(Pneu pneu) {
       return pneuRepository.save(pneu);
    }
}
