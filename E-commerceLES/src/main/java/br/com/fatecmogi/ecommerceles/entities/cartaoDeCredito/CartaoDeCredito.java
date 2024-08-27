package br.com.fatecmogi.ecommerceles.entities.cartaoDeCredito;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="CartoesDeCredito")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CartaoDeCredito implements IEntidadeDominio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "crt_seq")
    @SequenceGenerator(name = "crt_seq", allocationSize = 1)
    @Column(name="crt_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="clt_id")
    private Cliente cliente;

    @Column(name="crt_numeroCartao")
    private String numeroCartao;

    @Column(name="crt_nomeCartao")
    private String nomeCartao;

    @Column(name="crt_codigoSeguranca")
    private String codigoSeguranca;

    @Enumerated(EnumType.STRING)
    private BandeiraCartao bandeiraCartao;
}
