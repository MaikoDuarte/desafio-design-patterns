package engineer.maiko.desafiodiodesignpatterns.api.controller;

import engineer.maiko.desafiodiodesignpatterns.api.exception.EstoqueException;
import engineer.maiko.desafiodiodesignpatterns.api.model.Produto;
import engineer.maiko.desafiodiodesignpatterns.api.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
    private final EstoqueService estoqueService;

    @Autowired
    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return estoqueService.listarProdutos();
    }

    @GetMapping("/produto/{id}")
    public Produto encontrarProdutoPorId(@PathVariable Long id) {
        return estoqueService.encontrarProdutoPorId(id);
    }

    @PostMapping("/produto")
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return estoqueService.adicionarProduto(produto);
    }

    @PutMapping("/produto/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return estoqueService.atualizarProduto(id, produto);
    }

    @DeleteMapping("/produto/{id}")
    public void removerProduto(@PathVariable Long id) {
        estoqueService.removerProduto(id);
    }

    @PostMapping("/adicionar-estoque/{id}")
    public Produto adicionarAoEstoque(@PathVariable Long id, @RequestParam int quantidade) throws EstoqueException {
        return estoqueService.adicionarAoEstoque(id, quantidade);
    }

    @PostMapping("/remover-estoque/{id}")
    public Produto removerDoEstoque(@PathVariable Long id, @RequestParam int quantidade) throws EstoqueException {
        return estoqueService.removerDoEstoque(id, quantidade);
    }
}
