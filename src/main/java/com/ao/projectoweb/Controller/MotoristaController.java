package com.ao.projectoweb.Controller;

import com.ao.projectoweb.ComponentesDaPessoa.Condutor.CartaDeConducao;
import com.ao.projectoweb.ComponentesDaPessoa.Contacto;
import com.ao.projectoweb.ComponentesDaPessoa.Endereco;
import com.ao.projectoweb.Pessoa.Motorista;
import com.ao.projectoweb.DTO.MotoristaDTO;
import com.ao.projectoweb.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class MotoristaController {
    Motorista motorista;
    @Autowired
    MotoristaService motoristaService;
    @Autowired
    CartaConducaoMotoristaService cartaConducaoMotoristaService;
    @Autowired
    ContactoMotoristaService contactoMotoristaService;
    @Autowired
    EnderecoMotoristaService enderecoMotoristaService;

    @PostMapping("/saveMotorista")
    public ResponseEntity<Object> saveMotorista(@RequestBody @Validated MotoristaDTO motoristaDTO){
        try {
            motorista = new Motorista(
                    motoristaDTO.getNome(),
                    motoristaDTO.getSobrenome(),
                    motoristaDTO.getGenero(),
                    motoristaDTO.getDataMotorista(),
                    (Endereco) enderecoMotoristaService.save(new Endereco(motoristaDTO.getBairro(),motoristaDTO.getMunicipio(),motoristaDTO.getProvincia())),
                    (CartaDeConducao) cartaConducaoMotoristaService.save(new CartaDeConducao(motoristaDTO.getNumeroCarteira(),motoristaDTO.getCategoriaCarteira(),motoristaDTO.getDataEmissaoCarteira(),motoristaDTO.getDataValidadeCarteira(),motoristaDTO.isHabilitacaoAtiva())),
                    (Contacto) contactoMotoristaService.save(new Contacto(motoristaDTO.getTelefone1(),motoristaDTO.getTelefone2(),motoristaDTO.getNumeroDeEmergencia(),motoristaDTO.getEmail())),
                    motoristaDTO.getNumeroCNH(),
                    motoristaDTO.getCategoriaCNH(),
                    motoristaDTO.getDataValidadeCNH(),
                    LocalDateTime.now(ZoneId.of("UTC")));
            return ResponseEntity.status(HttpStatus.CREATED).body(motoristaService.save(motorista));
        } finally {
            var cartaDeConducao = cartaConducaoMotoristaService.findBynumeroCarteira(motoristaDTO.getNumeroCarteira());
            cartaDeConducao.setMotorista(motorista);
            cartaConducaoMotoristaService.save(cartaDeConducao);
        }

    }
}
