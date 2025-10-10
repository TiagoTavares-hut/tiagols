package edu.tiagols.padaria;

import edu.tiagols.padaria.Produto;
import edu.tiagols.padaria.ProdutoEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author TiagoT
 */
public class ProdutoService {
    
    private static Random r = new Random();

    public static List<Produto> inicializarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        for (ProdutoEnum item : ProdutoEnum.values()) {
            Produto produto = new Produto();
            produto.setCodigo(item.getCodigo());
            produto.setDescricao(item.getDescricao());
            produto.setPreco(item.getPreco());
            produto.setSaldoEstoque(r.nextInt(5, 20));
            produtos.add(produto);
        }
        return produtos;
    }
}