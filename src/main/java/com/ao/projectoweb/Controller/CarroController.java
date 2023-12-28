package com.ao.projectoweb.Controller;

import com.ao.projectoweb.ComponentesDoVeiculo.Motor;
import com.ao.projectoweb.ComponentesDoVeiculo.Pneu;
import com.ao.projectoweb.DTO.CarroDTO;
import com.ao.projectoweb.Service.CarroService;
import com.ao.projectoweb.Service.FrotasVeicularService;
import com.ao.projectoweb.Service.MotorService;
import com.ao.projectoweb.Service.PneuService;
import com.ao.projectoweb.Veiculos.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*")
public class CarroController {
    @Autowired
    CarroService carroService;
    @Autowired
    PneuService pneuService;
    @Autowired
    MotorService motorService;
    @Autowired
    FrotasVeicularService frotasVeicularService;
    @PostMapping("/saveCarro")
    public ResponseEntity<Object> saveCarro(@RequestBody @Validated CarroDTO carroDTO){
        Carro carro;
        carro = new Carro(
                carroDTO.getModelo(),
                carroDTO.getMarca(),
                carroDTO.getAno(),
                (Pneu) pneuService.save(new Pneu(carroDTO.getTempoEstimadoDeVida(),carroDTO.getTamanho(),carroDTO.getTipo())),
                LocalDateTime.now(ZoneId.of("UTC")),
                carroDTO.getNPortas(),
                carroDTO.getCombustivel(),
                carroDTO.isArCondicionado(),
                (Motor) motorService.save(new Motor(carroDTO.getCapacidade(),carroDTO.getPotencia())));
        return ResponseEntity.status(HttpStatus.CREATED).body(carroService.save(carro));
    }
}
