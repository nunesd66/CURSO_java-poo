package com.nunesd66.cap3;

import com.nunesd66.entities.Preco;
import com.nunesd66.entities.Produto;

public class Aula_13 {
    public static void main(String[] args) {
        Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Preço venda: " + preco.precoVenda);
    }
}
