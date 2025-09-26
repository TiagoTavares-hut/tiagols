
package edu.tiagols.padaria;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;

    @Override
    public String toString() {
        return  codigo + "-" + descricao ;
    }
    
    
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Produto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

   
    }
    
    
    
  


    
