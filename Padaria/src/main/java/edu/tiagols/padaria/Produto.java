package edu.tiagols.padaria;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int saldoEstoque;

    // CONSTRUTOR VAZIO (adicionar este)
    public Produto() {
        // Construtor vazio necessário para o ProdutoService
    }

    // Construtor com parâmetros (opcional, se for usar)
    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.saldoEstoque = 10;
    }

    // Getters e Setters (seus métodos estão corretos)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getSaldoEstoque() {
        return saldoEstoque;
    }

    public void setSaldoEstoque(int saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }
    public void diminuirEstoque(int quantidade) {
        this.saldoEstoque -= quantidade;
    }

    public void aumentarEstoque(int quantidade) {
        this.saldoEstoque += quantidade;
    }

    @Override
    public String toString() {
        return codigo + "-" + descricao;
    }
}