package br.com.fatecmogi.ecommerceles.entities.endereco;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(of = "id")
@Table(name="Enderecos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "end_tpEndereco", discriminatorType = DiscriminatorType.STRING)
public abstract class Endereco implements IEntidadeDominio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "end_seq")
    @SequenceGenerator(name = "end_seq", allocationSize = 1)
    @Column(name="end_id")
    private Long id;

    @Transient
    private Cliente cliente;

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
