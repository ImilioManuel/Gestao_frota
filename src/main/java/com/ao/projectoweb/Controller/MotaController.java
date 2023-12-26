package com.ao.projectoweb.Controller;

import com.ao.projectoweb.ComponentesDoVeiculo.Motor;
import com.ao.projectoweb.ComponentesDoVeiculo.Pneu;
import com.ao.projectoweb.DTO.CarroDTO;
import com.ao.projectoweb.DTO.MotaDTO;
import com.ao.projectoweb.Service.*;
import com.ao.projectoweb.Veiculos.Carro;
import com.ao.projectoweb.Veiculos.Mota;
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
public class MotaController {
    @Autowired
    MotaService motaService;
    @Autowired
    PneuService pneuService;
    @Autowired
    MotorService motorService;
    @Autowired
    FrotasVeicularService frotasVeicularService;
    @PostMapping("/saveMota")
    public ResponseEntity<Object> saveCarro(@RequestBody @Validated MotaDTO motaDTO){
        Mota mota;
        mota = new Mota(
                motaDTO.getModelo(),
                motaDTO.getMarca(),
                motaDTO.getAno(),
                (Pneu) pneuService.save(new Pneu(motaDTO.getTempoEstimadoDeVida(),motaDTO.getTamanho(),motaDTO.getTipo())),
                LocalDateTime.now(ZoneId.of("UTC")),
                motaDTO.getCilindro(),
                motaDTO.getGuidao(),
                motaDTO.isPartidaElectrica(),
                (Motor) motorService.save(new Motor(motaDTO.getCapacidade(),motaDTO.getPotencia())));
        return ResponseEntity.status(HttpStatus.CREATED).body(motaService.save(mota));
    }
}
