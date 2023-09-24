package engineer.maiko.desafiodiodesignpatterns.api.service.impl;

import engineer.maiko.desafiodiodesignpatterns.api.model.Produto;
import engineer.maiko.desafiodiodesignpatterns.api.service.EstrategiaGerenciamentoEstoque;

public class EstrategiaGerenciamentoEstoqueSimples implements EstrategiaGerenciamentoEstoque {

    @Override
    public void gerenciarEstoque(Produto produto, int quantidade) {
        // Atualiza a quantidade em estoque
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + quantidade);
    }

}
