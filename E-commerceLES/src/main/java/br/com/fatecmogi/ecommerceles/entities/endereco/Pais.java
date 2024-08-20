package br.com.fatecmogi.ecommerceles.entities.endereco;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Pais {
    private String pais;
}
