package com.nunesd66.cap2;

import java.util.Scanner;

// 2.17. Recebendo entrada de dados
public class a_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC de " + nome + ": " + imc);
    }
}
