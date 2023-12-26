package com.ao.projectoweb.Service;

import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;
import com.ao.projectoweb.Interfaces.IFrotaVeiculo;
import com.ao.projectoweb.Repository.CarroRepository;
import com.ao.projectoweb.Repository.FrotasVeicularRepository;
import com.ao.projectoweb.Repository.MotaRepository;
import com.ao.projectoweb.Veiculos.Carro;
import com.ao.projectoweb.Veiculos.Mota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class MotaService implements IFrotaVeiculo {
    @Autowired
    MotaRepository motaRepository;
    @Autowired
    FrotasVeicularRepository frotasVeicularRepository;

    public Object save(Mota mota) {
        return motaRepository.save(mota);
    }

    public Optional<Mota> findById(UUID idVeiculo) {
        return motaRepository.findById(idVeiculo);
    }

    @Override
    public Object addFrotaVeiculo(FrotasVeicular frotasVeicular, UUID idVeiculo) {
        Optional<Mota> optional = motaRepository.findById(idVeiculo);
        if(optional.isPresent()){
            var mota = optional.get();
            mota.setFrotasVeicular(frotasVeicular);
            return motaRepository.save(mota);
        }
        else {
            return null;
        }
    }
}
