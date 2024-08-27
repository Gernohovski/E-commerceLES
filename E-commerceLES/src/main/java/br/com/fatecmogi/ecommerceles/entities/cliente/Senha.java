package br.com.fatecmogi.ecommerceles.entities.cliente;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Senha implements IEntidadeDominio {
    private String senha;
}
