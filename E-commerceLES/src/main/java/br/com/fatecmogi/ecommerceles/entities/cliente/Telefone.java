package br.com.fatecmogi.ecommerceles.entities.cliente;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Telefone implements IEntidadeDominio {

    @Enumerated(EnumType.STRING)
    private TipoTelefone tipoTelefone;

    private String numeroTelefone;
    private int DDD;
}
