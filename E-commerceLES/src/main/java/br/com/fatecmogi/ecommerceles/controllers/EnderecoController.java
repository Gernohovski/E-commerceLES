package br.com.fatecmogi.ecommerceles.controllers;

import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import br.com.fatecmogi.ecommerceles.entities.endereco.Endereco;
import br.com.fatecmogi.ecommerceles.services.implementation.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    private EnderecoService enderecoService;

    @Autowired
    public EnderecoController(final EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @PostMapping(path = "/{id}")
    public ResponseEntity<Endereco> criarEndereco(@PathVariable final Long id, @RequestBody Map<String, Object> enderecoMap, @RequestBody Endereco endereco) {

        String tipoEndereco = (String) enderecoMap.get("tipoEndereco");
        Endereco endereco = enderecoService.createEnderecoFromMap(enderecoMap, tipoEndereco);

        Endereco saveEndereco = (Endereco) enderecoService.createEnderecoCliente(endereco,id);
        return ResponseEntity.status(HttpStatus.CREATED).body(endereco);
    }
}
