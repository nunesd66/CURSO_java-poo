package com.nunesd66.cap2;

import java.util.Scanner;

// 2.30. Cláusulas break e continue
public class a_30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int divisor = entrada.nextInt();

        System.out.println("BREAK:");
        for (int i = 100; i <= 200; i++) {
            if (i % divisor == 0) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("CONTINUE:");
        for (int i = 100; i <= 120; i++) {
            if (i % divisor == 0) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("Fim do programa");
    }
}
