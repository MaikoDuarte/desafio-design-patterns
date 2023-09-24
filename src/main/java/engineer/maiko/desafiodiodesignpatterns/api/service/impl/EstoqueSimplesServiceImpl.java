package engineer.maiko.desafiodiodesignpatterns.api.service.impl;

import engineer.maiko.desafiodiodesignpatterns.api.exception.EstoqueException;
import engineer.maiko.desafiodiodesignpatterns.api.model.Produto;
import engineer.maiko.desafiodiodesignpatterns.api.repository.ProdutoRepository;
import engineer.maiko.desafiodiodesignpatterns.api.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueSimplesServiceImpl implements EstoqueService {
    private final ProdutoRepository produtoRepository;

    @Autowired
    public EstoqueSimplesServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto encontrarProdutoPorId(Long id) {
        return null;
    }

    @Override
    public Produto adicionarProduto(Produto produto) {
        return null;
    }

    @Override
    public Produto atualizarProduto(Long id, Produto produto) {
        return null;
    }

    @Override
    public void removerProduto(Long id) {

    }

    @Override
    public Produto adicionarAoEstoque(Long id, int quantidade) throws EstoqueException {
        return null;
    }

    @Override
    public Produto removerDoEstoque(Long id, int quantidade) throws EstoqueException {
        return null;
    }

}
