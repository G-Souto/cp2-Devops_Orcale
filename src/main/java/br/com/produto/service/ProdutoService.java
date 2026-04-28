package br.com.produto.service;

import br.com.produto.model.Produto;
import br.com.produto.repository.ProdutoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @PostConstruct
    public void carregarDados() {
        repository.save(new Produto("Notebook Dell", "Eletrônicos", 3499.90, 10));
        repository.save(new Produto("Mouse Logitech", "Periféricos", 149.90, 50));
        repository.save(new Produto("Teclado Mecânico", "Periféricos", 279.90, 30));
        repository.save(new Produto("Monitor LG 24\"", "Eletrônicos", 1299.00, 8));
        repository.save(new Produto("Headset HyperX", "Periféricos", 389.00, 20));
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Optional<Produto> atualizar(Long id, Produto dados) {
        return repository.findById(id).map(p -> {
            p.setNome(dados.getNome());
            p.setCategoria(dados.getCategoria());
            p.setPreco(dados.getPreco());
            p.setQuantidade(dados.getQuantidade());
            return repository.save(p);
        });
    }

    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
