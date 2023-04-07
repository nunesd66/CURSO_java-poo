package com.nunesd66.cap2;

import java.util.Scanner;

// 2.28. Estrutura de controle do-while
public class a_28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int soma = 0;

        do {
            System.out.println("Digite 0 para sair ou qualquer numero para somar: ");
            valor = entrada.nextInt();

            soma += valor;
            System.out.println("Soma: " + soma);
        } while (valor != 0);
    }
}
