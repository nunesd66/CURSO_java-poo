package com.nunesd66.cap2;

import java.util.Scanner;

// 2.19. Estruturas de controle if, else if e else
public class a_19 {
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

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Acima do peso");
        } else if (imc < 40) {
            System.out.println("Obesidade grau 1 ou 2");
        } else {
            System.out.println("Obesidade grau 3");
            System.out.println("Muito cuidado com o seu peso");
        }
    }
}
