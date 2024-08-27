package br.com.fatecmogi.ecommerceles.services.implementation;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import br.com.fatecmogi.ecommerceles.entities.cartaoDeCredito.CartaoDeCredito;
import br.com.fatecmogi.ecommerceles.entities.cliente.Cliente;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoCobranca;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoEntrega;
import br.com.fatecmogi.ecommerceles.entities.endereco.EnderecoResidencial;
import br.com.fatecmogi.ecommerceles.repositories.CartaoDeCreditoRepository;
import br.com.fatecmogi.ecommerceles.repositories.ClienteRepository;
import br.com.fatecmogi.ecommerceles.repositories.EnderecoRepository;
import br.com.fatecmogi.ecommerceles.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IService {

    private final ClienteRepository clienteRepository;

    private final EnderecoService enderecoService;
    private final CartaoDeCreditoService cartaoDeCreditoService;

    @Autowired
    public ClienteService(final ClienteRepository clienteRepository, final EnderecoService enderecoService,
                          final CartaoDeCreditoService cartaoDeCreditoService) {
        this.clienteRepository = clienteRepository;
        this.enderecoService = enderecoService;
        this.cartaoDeCreditoService = cartaoDeCreditoService;
    }

    @Override
    public IEntidadeDominio create(IEntidadeDominio entidade) {
        //Adicionar validações aqui

        Cliente cliente = (Cliente) entidade;
        Cliente clienteSalvo = clienteRepository.save(cliente);

        if (cliente.getEnderecosCobranca() != null) {
            for (EnderecoCobranca enderecoCobranca : cliente.getEnderecosCobranca()) {
                enderecoCobranca.setCliente(clienteSalvo);
                enderecoService.create(enderecoCobranca);
            }
        }

        if (cliente.getEnderecosEntrega() != null) {
            for (EnderecoEntrega enderecoEntrega : cliente.getEnderecosEntrega()) {
                enderecoEntrega.setCliente(clienteSalvo);
                enderecoService.create(enderecoEntrega);
            }
        }

        if (cliente.getEnderecoResidencial() != null) {
            EnderecoResidencial enderecoResidencial = cliente.getEnderecoResidencial();
            enderecoResidencial.setCliente(clienteSalvo);
            enderecoService.create(enderecoResidencial);
        }


        if (cliente.getCartoesDeCredito() != null) {
            for (CartaoDeCredito cartao : cliente.getCartoesDeCredito()) {
                cartao.setCliente(clienteSalvo);
                cartaoDeCreditoService.create(cartao);
            }
        }

        return clienteSalvo;
    }

}
