package engineer.maiko.desafiodiodesignpatterns.api.service;


import engineer.maiko.desafiodiodesignpatterns.api.model.Produto;

public interface EstrategiaGerenciamentoEstoque {
    void gerenciarEstoque(Produto produto, int quantidade);
}
