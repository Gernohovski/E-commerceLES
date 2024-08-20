package br.com.fatecmogi.ecommerceles.entities.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
@Embeddable
public class Cidade {
    private String cidade;

    @Embedded
    private Estado estado;
}
