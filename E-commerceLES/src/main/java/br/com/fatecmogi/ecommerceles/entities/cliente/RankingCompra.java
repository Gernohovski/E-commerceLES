package br.com.fatecmogi.ecommerceles.entities.cliente;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RankingCompra implements IEntidadeDominio {
    private int rankingCompra;
}
