package controllers;

import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import br.com.fatecmogi.ecommerceles.services.implementation.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.ref.Cleaner;

@Controller
public class ClienteController {

    public final ClienteService clienteService;

    @Autowired
    public ClienteController (ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    /*@PutMapping(path = "/cliente")
    public ResponseEntity<Cliente> createCliente(@RequestBody final Cliente cliente){

    }*/
}
