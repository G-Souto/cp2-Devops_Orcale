package br.com.produto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String categoria;
    private Double preco;
    private Integer quantidade;

    public Produto() {}

    public Produto(String nome, String categoria, Double preco, Integer quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public Double getPreco() { return preco; }
    public Integer getQuantidade() { return quantidade; }

    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPreco(Double preco) { this.preco = preco; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
}
