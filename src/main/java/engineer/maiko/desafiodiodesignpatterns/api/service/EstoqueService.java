package engineer.maiko.desafiodiodesignpatterns.api.service;

import engineer.maiko.desafiodiodesignpatterns.api.exception.EstoqueException;
import engineer.maiko.desafiodiodesignpatterns.api.model.Produto;

import java.util.List;

public interface EstoqueService {
    List<Produto> listarProdutos();
    Produto encontrarProdutoPorId(Long id);
    Produto adicionarProduto(Produto produto);
    Produto atualizarProduto(Long id, Produto produto);
    void removerProduto(Long id);
    Produto adicionarAoEstoque(Long id, int quantidade) throws EstoqueException;
    Produto removerDoEstoque(Long id, int quantidade) throws EstoqueException;
}
