package engineer.maiko.desafiodiodesignpatterns.api.service.impl;

import engineer.maiko.desafiodiodesignpatterns.api.model.Produto;
import engineer.maiko.desafiodiodesignpatterns.api.service.ProdutoFactory;
import org.springframework.stereotype.Service;

@Service
public class ProdutoFactoryLote implements ProdutoFactory {

    @Override
    public Produto criarProduto() {

        return new Produto();
    }
}
