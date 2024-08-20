package br.com.fatecmogi.ecommerceles.entities.cartaoDeCredito;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="CartoesDeCredito")
public class CartaoDeCredito {

    @Id
    @Column(name="crt_id")
    private Long id;

    @Column(name="crt_numeroCartao")
    private String numeroCartao;

    @Column(name="crt_nomeCartao")
    private String nomeCartao;

    @Column(name="crt_codigoSeguranca")
    private String codigoSeguranca;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "bandeiraCartao", column = @Column(name = "crt_bandeiraCartao"))
    })
    private BandeiraCartao bandeiraCartao;
}
