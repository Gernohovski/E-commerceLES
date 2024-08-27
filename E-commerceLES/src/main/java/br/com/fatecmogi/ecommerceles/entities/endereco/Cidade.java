package br.com.fatecmogi.ecommerceles.entities.endereco;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
@Embeddable
public class Cidade implements IEntidadeDominio {
    private String cidade;

    @Embedded
    private Estado estado;
}
