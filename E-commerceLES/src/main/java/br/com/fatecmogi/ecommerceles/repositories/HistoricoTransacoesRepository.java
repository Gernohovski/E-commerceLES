package br.com.fatecmogi.ecommerceles.repositories;

import br.com.fatecmogi.ecommerceles.entities.cliente.HistoricoTransacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoTransacoesRepository extends JpaRepository<HistoricoTransacoes, Long> {
}
