package com.ao.projectoweb.Service;

import com.ao.projectoweb.ComponentesDoVeiculo.Motor;
import com.ao.projectoweb.Repository.MotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MotorService {
    @Autowired
    MotorRepository motorRepository;

    public Object save(Motor motor) {
        return motorRepository.save(motor);
    }
}
