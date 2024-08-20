package br.com.fatecmogi.ecommerceles.entities.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
@Embeddable
public class Estado {
    private String estado;

    @Embedded
    private Pais pais;
}
