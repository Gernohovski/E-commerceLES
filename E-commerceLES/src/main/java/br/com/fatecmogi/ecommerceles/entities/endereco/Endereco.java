package br.com.fatecmogi.ecommerceles.entities.endereco;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Enderecos")
public abstract class Endereco {

    @Id
    @Column(name="end_id")
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "cidade", column = @Column(name= "end_cidade")),
            @AttributeOverride(name = "estado.estado", column = @Column(name = "end_estado")),
            @AttributeOverride(name = "estado.pais.pais", column = @Column(name="end_pais"))
    })
    private Cidade cidade;

    @Column(name="end_bairro")
    private String bairro;

    @Column(name="end_logradouro")
    private String logradouro;

    @Column(name="end_numero")
    private String numero;

    @Column(name="end_cep")
    private String CEP;

    @Column(name="end_fraseIdentificacao")
    private String fraseIdentificacao;

    @Column(name="end_observacao")
    private String observacao;

    @Enumerated(EnumType.STRING)
    @Column(name="end_tipoResidencia")
    private TipoResidencia tipoResidencia;

    @Enumerated(EnumType.STRING)
    @Column(name="end_tipoLogradouro")
    private TipoLogradouro tipoLogradouro;
}
