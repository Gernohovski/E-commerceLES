package br.com.fatecmogi.ecommerceles.entities.cliente;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="historicoTrasacoes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class HistoricoTransacoes implements IEntidadeDominio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "hst_seq")
    @Column(name="hst_id")
    @SequenceGenerator(name = "hst_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name="clt_id")
    private Cliente cliente;
}
