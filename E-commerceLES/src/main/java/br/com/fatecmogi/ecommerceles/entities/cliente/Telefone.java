package br.com.fatecmogi.ecommerceles.entities.cliente;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
@Embeddable
public class Telefone {

    @Embedded
    private TipoTelefone tipoTelefone;
    private String numeroTelefone;
    private int DDD;
}
