package br.com.fatecmogi.ecommerceles.repositories;

import br.com.fatecmogi.ecommerceles.entities.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
