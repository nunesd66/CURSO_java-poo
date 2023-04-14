package com.nunesd66.entities;

public class Produto {

    public String descricao;
	public int quantidade;
	
    public void descrever() {
		System.out.println(descricao + " - " + quantidade + " itens");
	}

    public void definirPreco(
            Preco preco, 
            double percentualImpostos, 
            double margemLucro) {
		preco.valorImpostos = preco.valorCustos * (percentualImpostos / 100);
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
	}
}
