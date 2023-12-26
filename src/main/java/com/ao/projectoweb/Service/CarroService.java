package com.ao.projectoweb.Service;

import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;
import com.ao.projectoweb.Interfaces.IFrotaVeiculo;
import com.ao.projectoweb.Repository.CarroRepository;
import com.ao.projectoweb.Repository.FrotasVeicularRepository;
import com.ao.projectoweb.Veiculos.Carro;
import com.ao.projectoweb.Veiculos.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CarroService implements IFrotaVeiculo {
    @Autowired
    CarroRepository carroRepository;
    @Autowired
    FrotasVeicularRepository frotasVeicularRepository;

    public Object save(Carro carro) {
        return carroRepository.save(carro);
    }

    public Optional<Carro> findById(UUID idVeiculo) {
        return carroRepository.findById(idVeiculo);
    }

    @Override
    public Object addFrotaVeiculo(FrotasVeicular frotasVeicular, UUID idCarro) {
        Optional<Carro> optional = carroRepository.findById(idCarro);
        if(optional.isPresent()){
            var carro = optional.get();
            carro.setFrotasVeicular(frotasVeicular);
            return carroRepository.save(carro);
        }
        else {
            return null;
        }
    }
}
