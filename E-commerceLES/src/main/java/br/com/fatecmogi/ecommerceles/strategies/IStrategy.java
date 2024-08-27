package br.com.fatecmogi.ecommerceles.strategies;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;

public interface IStrategy {
    String processar(IEntidadeDominio entidadeDominio);
}
