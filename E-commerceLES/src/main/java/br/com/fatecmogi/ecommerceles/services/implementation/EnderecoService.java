package br.com.fatecmogi.ecommerceles.services.implementation;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import br.com.fatecmogi.ecommerceles.entities.endereco.Endereco;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoCobranca;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoEntrega;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoResidencial;
import br.com.fatecmogi.ecommerceles.repositories.ClienteRepository;
import br.com.fatecmogi.ecommerceles.repositories.EnderecoRepository;
import br.com.fatecmogi.ecommerceles.services.IService;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService implements IService {

    private final EnderecoRepository enderecoRepository;
    private final ClienteRepository clienteRepository;

    public EnderecoService(final EnderecoRepository enderecoRepository,
                           final ClienteRepository clienteRepository) {
        this.enderecoRepository = enderecoRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public IEntidadeDominio create(IEntidadeDominio entidade) {
        Endereco endereco = (Endereco) entidade;
        return  enderecoRepository.save(endereco);
    }

    public IEntidadeDominio createEnderecoCliente(IEntidadeDominio entidade, Long id, String tipoEndereco) {

        Endereco endereco = (Endereco) entidade;
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        switch (tipoEndereco.toUpperCase()) {
            case "COBRANCA":
                endereco = new EnderecoCobranca();
                break;
            case "RESIDENCIAL":
                endereco = new EnderecoResidencial();
                break;
            case "ENTREGA":
                endereco = new EnderecoEntrega();
                break;
            default:
                throw new IllegalArgumentException("Tipo de endereço inválido: " + tipoEndereco);
        }

        //Adicionar validações aqui
        return endereco;
    }
}
