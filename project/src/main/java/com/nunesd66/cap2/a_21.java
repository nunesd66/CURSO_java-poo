package com.nunesd66.cap2;

import java.util.Scanner;

// 2.21. Escopo de variáveis
public class a_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        boolean podeDirigir = idade >= 18;
        String nomePai = "";

        if (!podeDirigir) {
            System.out.print("Nome do pai: ");

            nomePai = entrada.next();
        }

        System.out.println("Voce pode dirigir?");

        if (podeDirigir) {
            System.out.println("Sim, claro");
        } else {
            System.out.println("Nao, se fizer isso, seu pai " + nomePai + " vai preso");
        }
    }
}
