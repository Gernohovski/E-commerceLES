package br.com.fatecmogi.ecommerceles.repositories;

import br.com.fatecmogi.ecommerceles.entities.cartaoDeCredito.CartaoDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoDeCreditoRepository extends JpaRepository<CartaoDeCredito, Long> {
}
