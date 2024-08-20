package br.com.fatecmogi.ecommerceles.entities.cliente;

import br.com.fatecmogi.ecommerceles.entities.cartaoDeCredito.CartaoDeCredito;
import br.com.fatecmogi.ecommerceles.entities.endereco.Endereco;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoCobranca;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoEntrega;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoResidencial;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="Clientes")
public class Cliente {
    @Id
    @Column(name="clt_id")
    private Long id;

    @Column(name="clt_nome")
    private String nome;

    @Column(name="clt_cpf")
    private String cpf;

    @Column(name="clt_dataNascimento")
    private String dataNascimento;

    @Column(name="clt_status")
    private boolean status;

    @OneToMany(mappedBy = "cliente")
    private List<HistoricoTransacoes> historicoTransacoes;

    @Embedded
    @AttributeOverride(name = "rankingCompra", column = @Column(name="clt_ranking"))
    private RankingCompra rankingCompra;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="numeroTelefone", column = @Column(name="clt_telefone")),
            @AttributeOverride(name="DDD", column = @Column(name="clt_DDD")),
            @AttributeOverride(name="tipoTelefone.tipoTelefone", column = @Column(name="clt_tipoTelefone"))
    })
    private Telefone telefone;

    @Enumerated(EnumType.STRING)
    @Column(name="clt_genero")
    private Genero genero;

    @Embedded
    @AttributeOverride(name="senha", column = @Column(name="clt_senha"))
    private Senha senha;

    private List<EnderecoCobranca> enderecosCobranca;
    private List<EnderecoEntrega> enderecosEntrega;
    private EnderecoResidencial enderecoResidencial;

    private List<CartaoDeCredito> cartoesDeCredito;
}
