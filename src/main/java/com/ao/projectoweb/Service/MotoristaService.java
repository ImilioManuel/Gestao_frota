package com.ao.projectoweb.Service;

import com.ao.projectoweb.Condutor.Motorista;
import com.ao.projectoweb.Repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoristaService {
    @Autowired
    MotoristaRepository motoristaRepository;

    public Object save(Motorista motorista) {
        return motoristaRepository.save(motorista);
    }
    public void associarMotorista(){

    }
}
