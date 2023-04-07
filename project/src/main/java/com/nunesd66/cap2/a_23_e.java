package com.nunesd66.cap2;

import java.util.Scanner;

// 2.23. Exercício: operadores lógicos
public class a_23_e {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo do veiculo (passeio, caminhao)");
        String tipoVeiculo = entrada.nextLine();

        System.out.println("Velocidade maxima da via");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidade do veiculo");
        int velocidadeVeiculo = entrada.nextInt();

        // veiculo de passeio com velocidade maior que 10% da velocidade da via
        // e caminhao com velocidade maior que 5% deve receber multa
        if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1)
                || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
            System.out.println("Multa");
        }
    }
}
