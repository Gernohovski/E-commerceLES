package br.com.fatecmogi.ecommerceles.services.implementation;

import br.com.fatecmogi.ecommerceles.entities.IEntidadeDominio;
import br.com.fatecmogi.ecommerceles.entities.cartaoDeCredito.CartaoDeCredito;
import br.com.fatecmogi.ecommerceles.repositories.CartaoDeCreditoRepository;
import br.com.fatecmogi.ecommerceles.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartaoDeCreditoService implements IService {

    private final CartaoDeCreditoRepository cartaoDeCreditoRepository;

    @Autowired
    public CartaoDeCreditoService(final CartaoDeCreditoRepository cartaoDeCreditoRepository) {
        this.cartaoDeCreditoRepository = cartaoDeCreditoRepository;
    }

    @Override
    public IEntidadeDominio create(IEntidadeDominio entidade) {
        //Adicionar validações aqui
        CartaoDeCredito cartaoDeCredito = (CartaoDeCredito) entidade;
        return  cartaoDeCreditoRepository.save(cartaoDeCredito);
    }

}
