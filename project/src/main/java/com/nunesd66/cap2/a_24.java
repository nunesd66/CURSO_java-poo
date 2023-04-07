package com.nunesd66.cap2;

import java.util.Scanner;

// 2.24. Estrutura de controle switch
public class a_24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o final da placa: " );
        int finalPlaca = entrada.nextInt();

        switch (finalPlaca) {
            case 1:
                System.out.println("Vencimento dia 11 de Janeiro");
                break;
            case 2:
                System.out.println("Vencimento dia 12 de Janeiro");
                break;
            default:
                System.out.println("Vencimento sem data, desculpe");

        }
    }
}
