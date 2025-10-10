/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.tiagols.padaria;

/**
 *
 * @author TiagoT
 */
public class ProdutoVenda {
    private Produto produto;
    private int quantidade;
    private double total;
    
    //getters e setters

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.quantidade * this.produto.getPreco();
    }

        
    //toString contendo "quantidade x descricao = total"

    @Override
    public String toString() {
        return produto.getCodigo()+ " - R$ " + String.format("%.2f", produto.getPreco()) +
           " x" + quantidade + " = R$ " + String.format("%.2f", total);
    }
}

