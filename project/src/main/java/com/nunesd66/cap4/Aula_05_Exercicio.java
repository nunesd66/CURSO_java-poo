package com.nunesd66.cap4;

import java.util.Scanner;

import com.nunesd66.entities.Estoque;
import com.nunesd66.entities.Produto;

// 4.5. Exercício: arrays
public class Aula_05_Exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		// obtém a quantidade de produtos que o usuário deseja informar
		System.out.println("Quantos produtos?");
		int quantidadeProdutos = entrada.nextInt();
		
		// Precisamos dessa linha extra para garantir que uma nova linha seja lida,
		// pois nextInt não lê uma nova linha, mas apenas um número.
		// Fica feio, mas tente não coloca-la para ver o que acontece.
		entrada.nextLine(); 
		
		// instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();
		
		// instancia um array de produtos com a quantidade de
		// posições que o usuário informou
		estoque.produtos = new Produto[quantidadeProdutos];
		
		// percorre todas as posições no array (que estão nulas)
		// e preenche uma por uma com a entrada do teclado do usuário
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\nProduto " + i);
			System.out.println("------------------------");
			
			System.out.println("Descrição:");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.println("Quantidade de itens:");			
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();

        double quantidadeTotal = 0;
        for(Produto p : estoque.produtos) {
            quantidadeTotal += p.quantidade;
        }

        System.out.println("Quantidade total de produtos no estoque: " + quantidadeTotal);

        entrada.close();
    }
}
