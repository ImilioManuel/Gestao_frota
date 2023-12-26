package com.ao.projectoweb.Service;

import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;
import com.ao.projectoweb.Repository.CarroRepository;
import com.ao.projectoweb.Repository.FrotasVeicularRepository;
import com.ao.projectoweb.Veiculos.Carro;
import com.ao.projectoweb.Veiculos.Mota;
import com.ao.projectoweb.Veiculos.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FrotasVeicularService {
    @Autowired
    FrotasVeicularRepository frotasVeicularRepository;
    public List<FrotasVeicular> findAll() {
        return frotasVeicularRepository.findAll();
    }

    public void save(FrotasVeicular frotasManuel) {
        frotasVeicularRepository.save(frotasManuel);
    }

    public Optional<FrotasVeicular> findById(UUID idFrota) {
        return frotasVeicularRepository.findById(idFrota);
    }
    public Object adicionarCarroFrota(UUID idFrota, Carro carro) {
        Optional<FrotasVeicular> optionalFrota = frotasVeicularRepository.findById(idFrota);
        if (optionalFrota.isPresent()) {
            FrotasVeicular frotasVeicular = optionalFrota.get();
            List<Veiculo> veiculos = frotasVeicular.getVeiculo();
            veiculos.add(carro);
            frotasVeicular.setVeiculo(veiculos);
            return frotasVeicularRepository.save(frotasVeicular);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Frota Não encontrada!!");
    }
    public Object adicionarMotaFrota(UUID idFrota, Mota mota) {
        Optional<FrotasVeicular> optionalFrota = frotasVeicularRepository.findById(idFrota);
        if (optionalFrota.isPresent()) {
            FrotasVeicular frotasVeicular = optionalFrota.get();
            List<Veiculo> veiculos = frotasVeicular.getVeiculo();
            veiculos.add(mota);
            frotasVeicular.setVeiculo(veiculos);
            return frotasVeicularRepository.save(frotasVeicular);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Frota Não encontrada!!");
    }
}