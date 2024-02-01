package br.com.alura.comex;

public class Produto {
    // Cria a classe Produto com seus respectivos atributos:

    // Nome (Texto)
    // Descrição (Texto)
    // Preço Unitário (ponto flutuante)
    // Quantidade (numero).

    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
