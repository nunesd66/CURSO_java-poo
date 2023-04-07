package com.nunesd66.cap2;

import java.util.Scanner;

// 2.27. Estrutura de controle while
public class a_27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero inicial: ");
        int numeroInicial = entrada.nextInt();

        System.out.print("Digite o numero final: ");
        int numeroFinal = entrada.nextInt();

        int numeroAtual = numeroInicial;

        while (numeroAtual <= numeroFinal) {
            System.out.println(numeroAtual);
            numeroAtual++;
        }
    }
}
