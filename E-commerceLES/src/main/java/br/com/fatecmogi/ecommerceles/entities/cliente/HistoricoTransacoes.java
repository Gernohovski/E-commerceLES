package br.com.fatecmogi.ecommerceles.entities.cliente;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="historicoTrasacoes")
public class HistoricoTransacoes {

    @Id
    @Column(name="hst_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="clt_id")
    private Cliente cliente;
}
