package br.com.fatecmogi.ecommerceles.entities.cliente;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TipoTelefone {
    private String tipoTelefone;
}
