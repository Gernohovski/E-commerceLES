package br.com.fatecmogi.ecommerceles.entities.endereco;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Pais implements IEntidadeDominio {
    private String pais;
}
