package br.com.fatecmogi.ecommerceles.entities.endereco;

import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("COBRANCA")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class EnderecoCobranca extends Endereco{

    @ManyToOne
    @JoinColumn(name="clt_id")
    private Cliente cliente;
}
