package br.com.fatecmogi.ecommerceles.entities.cartaoDeCredito;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class BandeiraCartao {
    private String bandeiraCartao;
}
