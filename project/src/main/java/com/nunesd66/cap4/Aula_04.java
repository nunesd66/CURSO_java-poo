package com.nunesd66.cap4;

import com.nunesd66.entities.Carro;

// 4.4. Trabalhando com arrays
public class Aula_04 {
    public static void main(String[] args) {

        // teste array
        int[] notas = new int[4];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		
		System.out.println("Nota do primeiro aluno: " + notas[0]);
		
		System.out.println("Tamanho do array: " + notas.length);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posicao[" + i + "]=" + notas[i]);
		}

        // teste array com carro
        Carro[] carros = new Carro[4];
		
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2011;
		
		System.out.println("Ano fabricacao: " + carros[0].anoDeFabricacao);
    }
}
