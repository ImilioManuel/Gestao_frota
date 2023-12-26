package com.ao.projectoweb.Controller;


import com.ao.projectoweb.DTO.FrotaDTO;
import com.ao.projectoweb.GestaoFrotas.FrotasVeicular;
import com.ao.projectoweb.Service.CarroService;
import com.ao.projectoweb.Service.FrotasVeicularService;
import com.ao.projectoweb.Service.MotaService;
import com.ao.projectoweb.Veiculos.Carro;
import com.ao.projectoweb.Veiculos.Mota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@CrossOrigin(origins = "*")
public class frotaVeicularController {
    @Autowired
    FrotasVeicularService frotasVeicularService;
    @Autowired
    CarroService carroService;
    @Autowired
    MotaService motaService;
    @PostMapping("/saveCarroFrota")
    public ResponseEntity<Object> saveCarroFrota(@RequestBody FrotaDTO frotaDTO){
        Optional<Carro> optionalCarro = carroService.findById(frotaDTO.getIdVeiculo());
        if (optionalCarro.isPresent()){
            var frota =(FrotasVeicular) frotasVeicularService.adicionarCarroFrota(frotaDTO.getIdFrota(),optionalCarro.get());
            carroService.addFrotaVeiculo(frota,frotaDTO.getIdVeiculo());
            return ResponseEntity.status(HttpStatus.OK).body(frota);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Processo Falhado ");
    }
    @PostMapping("/saveMotaFrota")
    public ResponseEntity<Object> saveMotaFrota(@RequestBody FrotaDTO frotaDTO){
        Optional<Mota> optionalMota = motaService.findById(frotaDTO.getIdVeiculo());
        if (optionalMota.isPresent()){
            var frota =(FrotasVeicular) frotasVeicularService.adicionarMotaFrota(frotaDTO.getIdFrota(),optionalMota.get());
            motaService.addFrotaVeiculo(frota,frotaDTO.getIdVeiculo());
            return ResponseEntity.status(HttpStatus.OK).body(frota);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Processo Falhado ");
    }
    @GetMapping("/listFrota")
    public ResponseEntity<Object> listFrota(){
        return ResponseEntity.status(HttpStatus.OK).body(frotasVeicularService.findAll());
    }
}
