package br.com.fatecmogi.ecommerceles.repositories;

import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
