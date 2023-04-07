package com.nunesd66.cap2;

import java.util.Scanner;

// 2.29. Estrutura de controle for
public class a_29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ultimo numero: ");
        int numeroFinal = entrada.nextInt();

        // for (iniciacao; condicao; incremento)
        for (int i = 1; i <= numeroFinal; i++) {
            System.out.println(i);
        }
    }
}
