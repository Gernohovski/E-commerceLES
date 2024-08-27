package br.com.fatecmogi.ecommerceles.controllers;

import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import br.com.fatecmogi.ecommerceles.services.implementation.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService clienteService;

    @Autowired
    public ClienteController (final ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {
        Cliente saveCliente = (Cliente) clienteService.create(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }
}
